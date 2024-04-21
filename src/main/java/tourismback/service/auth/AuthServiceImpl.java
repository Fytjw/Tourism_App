package tourismback.service.auth;

import tourismback.models.dto.auth.SignupRequest;
import tourismback.models.dto.auth.UsersDTO;
import tourismback.entity.auth.Users;
import tourismback.enums.UserRole;
import tourismback.repository.auth.UsersRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{

    private final UsersRepository usersRepository;

    @PostConstruct
    public void createAdminAccount() {
        Users adminAccount = usersRepository.findByUserRole(UserRole.ADMIN);
        if (adminAccount == null) {
            Users newAdminAccount = new Users();
            newAdminAccount.setName("Admin");
            newAdminAccount.setEmail("admin@test.com");
            newAdminAccount.setPassword(new BCryptPasswordEncoder().encode("admin"));
            newAdminAccount.setUserRole(UserRole.ADMIN);
            usersRepository.save(newAdminAccount);
            System.out.println("Admin account created successfully");
        }
    }

    @Override
    public UsersDTO createCustomer(SignupRequest signupRequest) {
        Users user = new Users();
        user.setName(signupRequest.getName());
        user.setEmail(signupRequest.getEmail());
        user.setPassword(new BCryptPasswordEncoder().encode(signupRequest.getPassword()));
        user.setUserRole(UserRole.CUSTOMER);
        Users createdUser = usersRepository.save(user);
        UsersDTO userDto = new UsersDTO();
        userDto.setId(createdUser.getId());
        return userDto;
    }

    @Override
    public boolean hasCustomerWithEmail(String email) {
        return usersRepository.findFirstByEmail(email).isPresent();
    }
}
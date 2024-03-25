package tourismback.service.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import tourismback.entity.auth.Users;
import tourismback.repository.auth.UsersRepository;
import tourismback.security.MyUserDetails;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MyUserDetailsServer implements UserDetailsService {
    private final UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Users> users = usersRepository.findFirstByEmail(username);
        return users.map(MyUserDetails :: new)
                .orElseThrow(() -> new UsernameNotFoundException(username + " not found"));
    }
}

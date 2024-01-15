package tourismback.service.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tourismback.dto.auth.UsersDTO;
import tourismback.mapper.auth.UsersMapper;
import tourismback.repository.auth.UsersRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersService {
    private final UsersRepository usersRepository;
    private final UsersMapper usersMapper;

    public List<UsersDTO> getAllUsers(){
        return usersMapper.toDtoList(usersRepository.findAll());
    }

    public UsersDTO getUser(Long id){
        return usersMapper.toDto(usersRepository.findById(id).orElseThrow());
    }

    public UsersDTO addUser(UsersDTO usersDTO){
        return usersMapper.toDto(usersRepository.save(usersMapper.toModel(usersDTO)));
    }

    public UsersDTO updateUser(UsersDTO usersDTO){
        return usersMapper.toDto(usersRepository.save(usersMapper.toModel(usersDTO)));
    }

    public void deleteUser(Long id){usersRepository.deleteById(id);}

    public boolean hasUserWithEmail(String email){
        return usersRepository.findFirstByEmail(email).isPresent();
    }

    public UsersDTO loginUser(String email, String password){
        return usersMapper.toDto( usersRepository.findByEmailAndPassword(email, password));
    }
}

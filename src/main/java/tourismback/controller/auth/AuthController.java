package tourismback.controller.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tourismback.models.dto.auth.LoginDTO;
import tourismback.models.dto.auth.UsersDTO;
import tourismback.service.auth.UsersService;

@RestController
@RequestMapping("api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UsersService usersService;

    @PostMapping("signup")
    public ResponseEntity<?> signupUser(@RequestBody UsersDTO usersDTO){
        if(usersService.hasUserWithEmail(usersDTO.getEmail()))
            return new ResponseEntity<>("User already exist with this email", HttpStatus.NOT_ACCEPTABLE);
        UsersDTO createdUserDto = usersService.addUser(usersDTO);
        if (createdUserDto == null) return new ResponseEntity<>(
                "User not created, Come again later", HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(createdUserDto, HttpStatus.CREATED);
    }

    @GetMapping("login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO){
        if(!usersService.hasUserWithEmail(loginDTO.getEmail()))
            return new ResponseEntity<>("User does not exists!", HttpStatus.NOT_ACCEPTABLE);
        UsersDTO loginUser = usersService.loginUser(loginDTO.getEmail(), loginDTO.getPassword());
        if (loginUser == null) return new ResponseEntity<>(
                "Password or email not correct", HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(loginUser, HttpStatus.ACCEPTED);
    }
}

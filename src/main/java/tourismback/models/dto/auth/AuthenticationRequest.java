package tourismback.models.dto.auth;

import lombok.Data;

@Data
public class AuthenticationRequest {

    private String email;
    private String password;
}

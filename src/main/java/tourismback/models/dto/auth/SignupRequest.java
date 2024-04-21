package tourismback.models.dto.auth;

import lombok.Data;

@Data
public class SignupRequest {

    private String email;
    private String name;
    private String password;
}

package tourismback.models.dto.auth;

import lombok.Data;

@Data
public class LoginDTO {
    private String email;
    private String password;
}

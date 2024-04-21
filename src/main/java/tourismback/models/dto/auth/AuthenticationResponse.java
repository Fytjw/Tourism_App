package tourismback.models.dto.auth;

import tourismback.enums.UserRole;
import lombok.Data;

@Data
public class AuthenticationResponse {

    private String jwt;
    private UserRole userRole;
    private Long userId;
}

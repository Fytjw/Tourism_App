package tourismback.models.dto.auth;

import lombok.Builder;
import lombok.Data;

@Data
public class UsersDTO {
    private Long id;
    private String email;
    private String password;
    private String name;
}

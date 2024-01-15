package tourismback.dto.auth;

import lombok.Data;

@Data
public class UsersDTO {
    private Long id;
    private String email;
    private String password;
    private String name;
}

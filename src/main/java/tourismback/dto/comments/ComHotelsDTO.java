package tourismback.dto.comments;

import lombok.Data;
import tourismback.dto.auth.UsersDTO;
import tourismback.dto.hotels.HotelsDTO;

@Data
public class ComHotelsDTO {
    private Long id;
    private String message;
    private int rating;
    private HotelsDTO hotel;
    private UsersDTO user;
}

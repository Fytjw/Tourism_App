package tourismback.models.dto.comments;

import lombok.Data;
import tourismback.models.dto.auth.UsersDTO;
import tourismback.models.dto.hotels.HotelsDTO;

@Data
public class ComHotelsDTO {
    private Long id;
    private String message;
    private int rating;
    private HotelsDTO hotel;
    private UsersDTO user;
}

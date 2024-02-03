package tourismback.dto.comments;

import lombok.Data;
import tourismback.dto.auth.UsersDTO;
import tourismback.dto.places.PlacesDTO;

@Data
public class ComPlacesDTO {
    private Long id;
    private String message;
    private int rating;
    private PlacesDTO place;
    private UsersDTO user;
}

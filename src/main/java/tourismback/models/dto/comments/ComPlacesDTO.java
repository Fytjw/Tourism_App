package tourismback.models.dto.comments;

import lombok.Data;
import tourismback.models.dto.auth.UsersDTO;
import tourismback.models.dto.places.PlacesDTO;

@Data
public class ComPlacesDTO {
    private Long id;
    private String message;
    private int rating;
    private PlacesDTO place;
    private UsersDTO user;
}

package tourismback.models.dto.favorite;

import lombok.Data;
import tourismback.models.dto.auth.UsersDTO;
import tourismback.models.dto.places.PlacesDTO;

@Data
public class FavPlacesDTO {
    private Long id;
    private PlacesDTO place;
    private UsersDTO user;
}

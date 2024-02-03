package tourismback.dto.favorite;

import lombok.Data;
import tourismback.dto.auth.UsersDTO;
import tourismback.dto.places.PlacesDTO;

@Data
public class FavPlacesDTO {
    private Long id;
    private PlacesDTO place;
    private UsersDTO user;
}

package tourismback.models.dto.favorite;

import lombok.Data;
import tourismback.models.dto.restaurants.RestaurantsDTO;
import tourismback.models.dto.auth.UsersDTO;

@Data
public class FavRestaurantsDTO {
    private Long id;
    private RestaurantsDTO restaurant;
    private UsersDTO user;
}

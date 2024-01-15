package tourismback.dto.favorite;

import lombok.Data;
import tourismback.dto.restaurants.RestaurantsDTO;
import tourismback.dto.auth.UsersDTO;

@Data
public class FavRestaurantsDTO {
    private Long id;
    private RestaurantsDTO restaurant;
    private UsersDTO user;
}

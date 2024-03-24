package tourismback.models.dto.comments;

import lombok.Data;
import tourismback.models.dto.auth.UsersDTO;
import tourismback.models.dto.restaurants.RestaurantsDTO;

@Data
public class ComRestaurantsDTO {
    private Long id;
    private String message;
    private int rating;
    private RestaurantsDTO restaurant;
    private UsersDTO user;
}

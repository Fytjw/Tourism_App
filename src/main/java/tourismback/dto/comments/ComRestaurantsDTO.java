package tourismback.dto.comments;

import lombok.Data;
import tourismback.dto.auth.UsersDTO;
import tourismback.dto.restaurants.RestaurantsDTO;

@Data
public class ComRestaurantsDTO {
    private Long id;
    private String message;
    private int rating;
    private RestaurantsDTO restaurant;
    private UsersDTO user;
}

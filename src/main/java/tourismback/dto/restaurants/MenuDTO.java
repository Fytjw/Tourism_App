package tourismback.dto.restaurants;

import lombok.Data;

import java.util.List;

@Data
public class MenuDTO {
    private Long id;
    private RestaurantsDTO restaurant;
    private List<FoodDTO> foods;
}

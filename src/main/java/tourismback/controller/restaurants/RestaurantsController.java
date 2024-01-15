package tourismback.controller.restaurants;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tourismback.dto.restaurants.RestaurantsDTO;
import tourismback.service.restaurants.RestaurantsService;

import java.util.List;

@RestController
@RequestMapping("restaurants")
@RequiredArgsConstructor
public class RestaurantsController {
    private final RestaurantsService restaurantsService;

    @GetMapping
    public List<RestaurantsDTO> getRestaurants(){
        return restaurantsService.getAllRestaurants();
    }

    @GetMapping("/restaurant/{id}")
    public RestaurantsDTO getRestaurant(
            @PathVariable(name="id") Long id
    ){
        return restaurantsService.getRestaurants(id);
    }

    @PostMapping
    public RestaurantsDTO addRestaurant(
            @RequestBody RestaurantsDTO restaurantsDTO
    ){
        return restaurantsService.addRestaurants(restaurantsDTO);
    }

    @PutMapping
    public RestaurantsDTO updateRestaurant(
            @RequestBody RestaurantsDTO restaurantsDTO
    ){
        return restaurantsService.updateRestaurants(restaurantsDTO);
    }

    @DeleteMapping
    public void deleteRestaurant(
            @PathVariable(name="id") Long id
    ){
        restaurantsService.deleteRestaurants(id);
    }
}

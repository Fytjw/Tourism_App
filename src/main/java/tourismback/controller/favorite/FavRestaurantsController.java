package tourismback.controller.favorite;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tourismback.dto.favorite.FavRestaurantsDTO;
import tourismback.service.favorite.FavRestaurantsService;

import java.util.List;

@RestController
@RequestMapping("favRestaurants")
@RequiredArgsConstructor
public class FavRestaurantsController {
    private final FavRestaurantsService favRestaurantsService;

    @GetMapping
    public List<FavRestaurantsDTO> getFavRestaurants(){
        return favRestaurantsService.getAllFavRestaurants();
    }

    @GetMapping("favRestaurant/{id}")
    public FavRestaurantsDTO getFavRestaurant(
            @PathVariable(name="id") Long id
    ){
        return favRestaurantsService.getFavRestaurants(id);
    }

    @PostMapping
    public FavRestaurantsDTO addFavRestaurant(
            @RequestBody FavRestaurantsDTO favRestaurantsDTO
    ){
        return favRestaurantsService.addFavRestaurants(favRestaurantsDTO);
    }

    @PutMapping
    public FavRestaurantsDTO updateFavRestaurant(
            @RequestBody FavRestaurantsDTO favRestaurantsDTO
    ){
        return favRestaurantsService.updateFavRestaurants(favRestaurantsDTO);
    }

    @DeleteMapping
    public void deleteFavRestaurant(
            @PathVariable(name="id") Long id
    ){
        favRestaurantsService.deleteFavRestaurants(id);
    }

}

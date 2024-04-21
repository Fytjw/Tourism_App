package tourismback.controller.comments;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import tourismback.models.dto.comments.ComRestaurantsDTO;
import tourismback.security.MyUserDetails;
import tourismback.service.comments.ComRestaurantsService;

import java.util.List;

@RestController
@RequestMapping("comRestaurants")
@RequiredArgsConstructor
public class ComRestaurantsController {
    private final ComRestaurantsService comRestaurantsService;

    @GetMapping
    public List<ComRestaurantsDTO> getAllComRestaurants(){
        return comRestaurantsService.getAllComRestaurants();
    }

    @GetMapping("comRestaurant/{id}")
    public ComRestaurantsDTO getComRestaurants(
            @PathVariable(name = "id") Long id
    ){
        return comRestaurantsService.getComRestaurants(id);
    }

    @PostMapping
    public ComRestaurantsDTO addComRestaurants(
            @RequestBody ComRestaurantsDTO comRestaurantsDTO
    ){
        return comRestaurantsService.addComRestaurants(comRestaurantsDTO);
    }

    @PutMapping
    public ComRestaurantsDTO updateComRestaurants(
            @RequestBody ComRestaurantsDTO comRestaurantsDTO
    ){
        return comRestaurantsService.updateComRestaurants(comRestaurantsDTO);
    }

    @DeleteMapping
    public void deleteComRestaurants(
            @PathVariable(name = "id") Long id
    ){
        comRestaurantsService.deleteComRestaurants(id);
    }
}

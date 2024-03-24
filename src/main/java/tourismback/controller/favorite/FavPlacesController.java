package tourismback.controller.favorite;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tourismback.models.dto.favorite.FavPlacesDTO;
import tourismback.service.favorite.FavPlacesService;

import java.util.List;

@RestController
@RequestMapping("favPlaces")
@RequiredArgsConstructor
public class FavPlacesController {
    private final FavPlacesService favPlacesService;

    @GetMapping
    public List<FavPlacesDTO> getFavPlaces(){
        return favPlacesService.getAllFavPlaces();
    }

    @GetMapping("favPlace/{id}")
    public FavPlacesDTO getFavPlaces(
            @PathVariable(name = "id") Long id
    ){
        return favPlacesService.getFavPlaces(id);
    }

    @PostMapping
    public FavPlacesDTO addFavPlaces(
            @RequestBody FavPlacesDTO favPlacesDTO
    ){
        return favPlacesService.addFavPlaces(favPlacesDTO);
    }

    @PutMapping
    public FavPlacesDTO updateFavPlaces(
            @RequestBody FavPlacesDTO favPlacesDTO
    ){
        return favPlacesService.updateFavPlaces(favPlacesDTO);
    }

    @DeleteMapping
    public void deleteFavPlaces(
            @PathVariable(name = "id") Long id
    ){
        favPlacesService.deleteFavPlaces(id);
    }
}

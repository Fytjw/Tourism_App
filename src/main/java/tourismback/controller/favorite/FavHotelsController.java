package tourismback.controller.favorite;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tourismback.dto.favorite.FavHotelsDTO;
import tourismback.service.favorite.FavHotelsService;

import java.util.List;

@RestController
@RequestMapping("favHotels")
@RequiredArgsConstructor
public class FavHotelsController {
    private final FavHotelsService favHotelsService;

    @GetMapping
    public List<FavHotelsDTO> getFavFavHotels(){
        return favHotelsService.getAllFavHotels();
    }

    @GetMapping("favHotel/{id}")
    public FavHotelsDTO getFavHotels(
            @PathVariable(name="id") Long id
    ){
        return favHotelsService.getFavHotels(id);
    }

    @PostMapping
    public FavHotelsDTO addFavHotels(
            @RequestBody FavHotelsDTO favHotelsDTO
    ){
        return favHotelsService.addFavHotels(favHotelsDTO);
    }

    @PutMapping
    public FavHotelsDTO updateFavHotels(
            @RequestBody FavHotelsDTO favRestaurantsDTO
    ){
        return favHotelsService.updateHotels(favRestaurantsDTO);
    }

    @DeleteMapping
    public void deleteFavHotels(
            @PathVariable(name="id") Long id
    ){
        favHotelsService.deleteHotels(id);
    }
}

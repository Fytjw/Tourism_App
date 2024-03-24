package tourismback.controller.favorite;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tourismback.models.dto.favorite.FavEventsDTO;
import tourismback.service.favorite.FavEventsService;

import java.util.List;

@RestController
@RequestMapping("favEvents")
@RequiredArgsConstructor
public class FavEventsController {
    private final FavEventsService favEventsService;

    @GetMapping
    public List<FavEventsDTO> getAllFavEvents(){
        return favEventsService.getAllFavEvents();
    }

    @GetMapping("favEvents/{id}")
    public FavEventsDTO getFavEvents(
            @PathVariable(name = "id") Long id
    ){
        return favEventsService.getFavEvents(id);
    }

    @PostMapping
    public FavEventsDTO addFavEvents(
            @RequestBody FavEventsDTO favEventsDTO
    ){
        return favEventsService.addFavEvents(favEventsDTO);
    }

    @PutMapping
    public FavEventsDTO updateFavEvents(
            @RequestBody FavEventsDTO favEventsDTO
    ){
        return favEventsService.updateFavEvents(favEventsDTO);
    }

    @DeleteMapping
    public void deleteFavEvents(
            @PathVariable(name = "id") Long id
    ){
        favEventsService.deleteFavEvents(id);
    }
}

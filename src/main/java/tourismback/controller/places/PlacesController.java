package tourismback.controller.places;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tourismback.dto.places.PlacesDTO;
import tourismback.service.places.PlacesService;

import java.util.List;

@RestController
@RequestMapping("places")
@RequiredArgsConstructor
public class PlacesController {
    private final PlacesService placesService;

    @GetMapping
    public List<PlacesDTO> getAllPlaces(){
        return placesService.getAllPlaces();
    }

    @GetMapping("place/{id}")
    public PlacesDTO getPlaces(
            @PathVariable(name = "id") Long id
    ){
        return placesService.getPlaces(id);
    }

    @PostMapping
    public PlacesDTO addPlaces(
            @RequestBody PlacesDTO placesDTO
    ){
        return placesService.addPlaces(placesDTO);
    }

    @PutMapping
    public PlacesDTO updatePlaces(
            @RequestBody PlacesDTO placesDTO
    ){
        return placesService.updatePlaces(placesDTO);
    }

    @DeleteMapping
    public void deletePlaces(
            @PathVariable(name = "id") Long id
    ){
        placesService.deletePlaces(id);
    }
}

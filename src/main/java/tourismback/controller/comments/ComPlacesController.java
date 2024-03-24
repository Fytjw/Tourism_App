package tourismback.controller.comments;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tourismback.models.dto.comments.ComPlacesDTO;
import tourismback.service.comments.ComPlacesService;

import java.util.List;

@RestController
@RequestMapping("comPlaces")
@RequiredArgsConstructor
public class ComPlacesController {
    private final ComPlacesService comPlacesService;

    @GetMapping
    public List<ComPlacesDTO> getAllComPlaces(){
        return comPlacesService.getAllComPlaces();
    }

    @GetMapping("comPlace/{id}")
    public ComPlacesDTO getComPlaces(
            @PathVariable(name = "id") Long id
    ){
        return comPlacesService.getComPlaces(id);
    }

    @PostMapping
    public ComPlacesDTO addComPlaces(
            @RequestBody ComPlacesDTO comPlacesDTO
    ){
        return comPlacesService.addComPlaces(comPlacesDTO);
    }

    @PutMapping
    public ComPlacesDTO updateComPlaces(
            @RequestBody ComPlacesDTO comPlacesDTO
    ){
        return comPlacesService.updateComPlaces(comPlacesDTO);
    }

    @DeleteMapping
    public void deleteComPlaces(
            @PathVariable(name = "id") Long id
    ){
        comPlacesService.deleteComPlaces(id);
    }
}

package tourismback.controller.comments;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tourismback.dto.comments.ComHotelsDTO;
import tourismback.service.comments.ComHotelsService;

import java.util.List;

@RestController
@RequestMapping("comHotels")
@RequiredArgsConstructor
public class ComHotelsController {
    private final ComHotelsService comHotelsService;

    @GetMapping
    public List<ComHotelsDTO> getAllComHotels(){
        return comHotelsService.getAllComHotels();
    }

    @GetMapping("comHotel/{id}")
    public ComHotelsDTO getComHotels(
            @PathVariable(name = "id") Long id
    ){
        return comHotelsService.getComHotels(id);
    }

    @PostMapping
    public ComHotelsDTO addComHotels(
            @RequestBody ComHotelsDTO comHotelsDTO
    ){
        return comHotelsService.addComHotels(comHotelsDTO);
    }

    @PutMapping
    public ComHotelsDTO updateComHotels(
            @RequestBody ComHotelsDTO comHotelsDTO
    ){
        return comHotelsService.updateComHotels(comHotelsDTO);
    }

    @DeleteMapping
    public void deleteComHotels(
            @PathVariable(name = "id") Long id
    ) { comHotelsService.deleteComHotels(id); }
}

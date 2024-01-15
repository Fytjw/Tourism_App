package tourismback.controller.comments;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tourismback.dto.comments.ComEventsDTO;
import tourismback.service.comments.ComEventsService;

import java.util.List;

@RestController
@RequestMapping("comEvents")
@RequiredArgsConstructor
public class ComEventsController {
    private final ComEventsService comEventsService;

    @GetMapping
    public List<ComEventsDTO> getAllComEvents(){
        return comEventsService.getAllComEvents();
    }

    @GetMapping("comEvent/{id}")
    public ComEventsDTO getComEvents(
            @PathVariable(name = "id") Long id
    ){
        return comEventsService.getComEvents(id);
    }

    @PostMapping
    public ComEventsDTO addComEvents(
            @RequestBody ComEventsDTO comEventsDTO
    ){
        return comEventsService.addComEvents(comEventsDTO);
    }

    @PutMapping
    public ComEventsDTO update(
            @RequestBody ComEventsDTO comEventsDTO
    ){
        return comEventsService.updateComEvents(comEventsDTO);
    }

    @DeleteMapping
    public void deleteComEvents(
            @PathVariable(name = "id") Long id
    ){
        comEventsService.deleteComEvents(id);
    }
}

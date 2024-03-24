package tourismback.controller.events;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tourismback.models.dto.events.EventsDTO;
import tourismback.service.events.EventsService;

import java.util.List;

@RestController
@RequestMapping("events")
@RequiredArgsConstructor
public class EventsController {
    private final EventsService eventsService;

    @GetMapping
    public List<EventsDTO> getAllEvents(){
        return eventsService.getAllEvents();
    }

    @GetMapping("vent/{id}")
    public EventsDTO getEvents(
            @PathVariable(name = "id") Long id
    ){
        return eventsService.getEvents(id);
    }

    @PostMapping
    public EventsDTO addEvents(
            @RequestBody EventsDTO eventsDTO
    ){
        return eventsService.addEvents(eventsDTO);
    }

    @PutMapping
    public EventsDTO updateEvents(
            @RequestBody EventsDTO eventsDTO
    ){
        return eventsService.updateEvents(eventsDTO);
    }

    @DeleteMapping
    public void deleteEvents(
            @PathVariable(name = "id") Long id
    ){
        eventsService.deleteEvents(id);
    }
}


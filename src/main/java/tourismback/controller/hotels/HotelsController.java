package tourismback.controller.hotels;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tourismback.models.dto.hotels.HotelsDTO;
import tourismback.service.hotels.HotelsService;

import java.util.List;

@RestController
@RequestMapping("hotels")
@RequiredArgsConstructor
public class HotelsController {
    private final HotelsService hotelsService;

    @GetMapping
    public List<HotelsDTO> getAllHotels(){
        return hotelsService.getAllHotels();
    }

    @GetMapping("hotel/{id}")
    public HotelsDTO getHotels(
            @PathVariable(name = "id") Long id
    ){
        return hotelsService.getHotels(id);
    }

    @PostMapping
    public HotelsDTO addHotels(
            @RequestBody HotelsDTO hotelsDTO
    ){
        return hotelsService.addHotels(hotelsDTO);
    }

    @PutMapping
    public HotelsDTO updateHotels(
            @RequestBody HotelsDTO hotelsDTO
    ){
        return hotelsService.updateHotels(hotelsDTO);
    }

    @DeleteMapping
    public void deleteHotels(
            @PathVariable(name = "id") Long id
    ){
        hotelsService.deleteHotels(id);
    }

}

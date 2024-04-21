package tourismback.controller.hotels;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tourismback.models.dto.hotels.HotelsDTO;
import tourismback.service.hotels.HotelsService;

import java.io.IOException;
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

    @PostMapping("/upload/{id}")
    public ResponseEntity<HttpStatus> uploadImage(@RequestParam("image") MultipartFile image,
                                                  @PathVariable Long id) throws IOException {
        hotelsService.saveAvatar(image, id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<byte[]> getAvatar(@PathVariable Long id) {
        byte[] image = hotelsService.getImageByUserId(id);
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(image);
    }

}

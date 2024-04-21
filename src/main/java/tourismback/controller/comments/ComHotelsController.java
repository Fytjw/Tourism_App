package tourismback.controller.comments;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import tourismback.models.dto.comments.ComHotelsDTO;
import tourismback.security.MyUserDetails;
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
        comHotelsDTO.getHotel().setId(getCurrentUserId());
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

    private Long getCurrentUserId(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        MyUserDetails userDetails = (MyUserDetails) authentication.getPrincipal();
        return userDetails.users.getId();
    }
}

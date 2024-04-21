package tourismback.service.comments;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import tourismback.models.dto.comments.ComPlacesDTO;
import tourismback.mapper.comments.ComPlacesMapper;
import tourismback.repository.comments.ComPlacesRepository;
import tourismback.security.MyUserDetails;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ComPlacesService {
    private final ComPlacesRepository comPlacesRepository;
    private final ComPlacesMapper comPlacesMapper;

    public List<ComPlacesDTO> getAllComPlaces(){
        return comPlacesMapper.toDtoList(comPlacesRepository.findAll());
    }

    public ComPlacesDTO getComPlaces(Long id){
        return comPlacesMapper.toDto(comPlacesRepository.findById(id).orElseThrow());
    }

    public ComPlacesDTO addComPlaces(ComPlacesDTO comPlacesDTO){
        comPlacesDTO.getUser().setId(getCurrentUserId());
        return comPlacesMapper.toDto(comPlacesRepository.save(comPlacesMapper.toModel(comPlacesDTO)));
    }

    public ComPlacesDTO updateComPlaces(ComPlacesDTO comPlacesDTO){
        return comPlacesMapper.toDto(comPlacesRepository.save(comPlacesMapper.toModel(comPlacesDTO)));
    }

    public void deleteComPlaces(Long id){
        comPlacesRepository.deleteById(id);
    }

    private Long getCurrentUserId(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        MyUserDetails userDetails = (MyUserDetails) authentication.getPrincipal();
        return userDetails.users.getId();
    }

}

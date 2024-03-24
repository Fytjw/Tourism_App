package tourismback.service.comments;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tourismback.models.dto.comments.ComHotelsDTO;
import tourismback.mapper.comments.ComHotelsMapper;
import tourismback.repository.comments.ComHotelsRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ComHotelsService {
    private final ComHotelsRepository comHotelsRepository;
    private final ComHotelsMapper comHotelsMapper;

    public List<ComHotelsDTO> getAllComHotels(){
        return comHotelsMapper.toDtoList(comHotelsRepository.findAll());
    }

    public ComHotelsDTO getComHotels(Long id){
        return comHotelsMapper.toDto(comHotelsRepository.findById(id).orElseThrow());
    }

    public ComHotelsDTO addComHotels(ComHotelsDTO comHotelsDTO){
        return comHotelsMapper.toDto(comHotelsRepository.save(comHotelsMapper.toModel(comHotelsDTO)));
    }

    public ComHotelsDTO updateComHotels(ComHotelsDTO comHotelsDTO){
        return comHotelsMapper.toDto(comHotelsRepository.save(comHotelsMapper.toModel(comHotelsDTO)));
    }

    public void deleteComHotels(Long id){ comHotelsRepository.deleteById(id); }

}

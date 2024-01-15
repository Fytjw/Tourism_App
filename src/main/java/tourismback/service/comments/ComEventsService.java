package tourismback.service.comments;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tourismback.dto.comments.ComEventsDTO;
import tourismback.mapper.comments.ComEventsMapper;
import tourismback.repository.comments.ComEventsRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ComEventsService {
    private final ComEventsRepository comEventsRepository;
    private final ComEventsMapper comEventsMapper;

    public List<ComEventsDTO> getAllComEvents(){
        return comEventsMapper.toDtoList(comEventsRepository.findAll());
    }

    public ComEventsDTO getComEvents(Long id){
        return comEventsMapper.toDto(comEventsRepository.findById(id).orElseThrow());
    }

    public ComEventsDTO addComEvents(ComEventsDTO comEventsDTO){
        return comEventsMapper.toDto(comEventsRepository.save(comEventsMapper.toModel(comEventsDTO)));
    }

    public ComEventsDTO updateComEvents(ComEventsDTO comEventsDTO){
        return comEventsMapper.toDto(comEventsRepository.save(comEventsMapper.toModel(comEventsDTO)));
    }

    public void deleteComEvents(Long id){ comEventsRepository.deleteById(id); }
}

package tourismback.service.events;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tourismback.models.dto.events.EventsDTO;
import tourismback.mapper.events.EventsMapper;
import tourismback.repository.events.EventsRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventsService {
    private final EventsRepository eventsRepository;
    private final EventsMapper eventsMapper;

    public List<EventsDTO> getAllEvents(){
        return eventsMapper.toDtoList(eventsRepository.findAll());
    }

    public EventsDTO getEvents(Long id){
        return eventsMapper.toDto(eventsRepository.findById(id).orElseThrow());
    }

    public EventsDTO addEvents(EventsDTO eventsDTO){
        return eventsMapper.toDto(eventsRepository.save(eventsMapper.toModel(eventsDTO)));
    }

    public EventsDTO updateEvents(EventsDTO eventsDTO){
        return eventsMapper.toDto(eventsRepository.save(eventsMapper.toModel(eventsDTO)));
    }

    public void deleteEvents(Long id){ eventsRepository.deleteById(id); }
}

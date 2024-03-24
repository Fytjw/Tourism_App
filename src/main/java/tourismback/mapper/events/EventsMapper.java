package tourismback.mapper.events;

import org.mapstruct.Mapper;
import tourismback.models.dto.events.EventsDTO;
import tourismback.entity.events.Events;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EventsMapper {
    EventsDTO toDto(Events events);

    Events toModel(EventsDTO eventsDTO);

    List<EventsDTO> toDtoList(List<Events> events);

    List<Events> toModelList(List<EventsDTO> eventsDTOS);
}

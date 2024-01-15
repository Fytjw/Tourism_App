package tourismback.mapper.comments;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import tourismback.dto.comments.ComEventsDTO;
import tourismback.entity.comments.ComEvents;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ComEventsMapper {
    @Mappings({
            @Mapping(target = "event.id", source = "events.id"),
            @Mapping(target = "user.id", source = "users.id")
    })
    ComEventsDTO toDto(ComEvents comEvents);

    @Mappings({
            @Mapping(target = "events.id", source = "event.id"),
            @Mapping(target = "users.id", source = "user.id")
    })
    ComEvents toModel(ComEventsDTO comEventsDTO);

    List<ComEventsDTO> toDtoList(List<ComEvents> comEvents);

    List<ComEvents> toModelList(List<ComEventsDTO> comEventsDTOS);
}

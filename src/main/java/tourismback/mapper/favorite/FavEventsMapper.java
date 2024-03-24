package tourismback.mapper.favorite;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import tourismback.models.dto.favorite.FavEventsDTO;
import tourismback.entity.favorite.FavEvents;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FavEventsMapper {
    @Mappings({
            @Mapping(target = "event.id", source = "events.id"),
            @Mapping(target = "user.id", source = "users.id")
    })
    FavEventsDTO toDto(FavEvents favEvents);

    @Mappings({
            @Mapping(target = "events.id", source = "event.id"),
            @Mapping(target = "users.id", source = "user.id")
    })
    FavEvents toModel(FavEventsDTO favEventsDTO);

    List<FavEventsDTO> toDtoList(List<FavEvents> favEvents);

    List<FavEvents> toModelList(List<FavEventsDTO> favEventsDTOS);
}

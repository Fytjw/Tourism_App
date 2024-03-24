package tourismback.mapper.comments;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import tourismback.models.dto.comments.ComPlacesDTO;
import tourismback.entity.comments.ComPlaces;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ComPlacesMapper {
    @Mappings({
            @Mapping(target = "place.id", source = "places.id"),
            @Mapping(target = "user.id", source = "users.id")
    })
    ComPlacesDTO toDto(ComPlaces comPlaces);

    @Mappings({
            @Mapping(target = "places.id", source = "place.id"),
            @Mapping(target = "users.id", source = "user.id")
    })
    ComPlaces toModel(ComPlacesDTO comPlacesDTO);

    List<ComPlacesDTO> toDtoList(List<ComPlaces> comPlaces);

    List<ComPlaces> toModelList(List<ComPlacesDTO> comPlacesDTOS);
}

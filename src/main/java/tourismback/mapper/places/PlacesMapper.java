package tourismback.mapper.places;

import org.mapstruct.Mapper;
import tourismback.models.dto.places.PlacesDTO;
import tourismback.entity.places.Places;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PlacesMapper {
    PlacesDTO toDto(Places places);

    Places toModel(PlacesDTO placesDTO);

    List<PlacesDTO> toDtoList(List<Places> places);

    List<Places> toModelList(List<PlacesDTO> placesDTOS);
}

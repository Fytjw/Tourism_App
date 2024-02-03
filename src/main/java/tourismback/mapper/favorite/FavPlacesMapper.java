package tourismback.mapper.favorite;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import tourismback.dto.favorite.FavPlacesDTO;
import tourismback.entity.favorite.FavPlaces;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FavPlacesMapper {
    @Mappings({
            @Mapping(target = "place.id", source = "places.id"),
            @Mapping(target = "user.id", source = "users.id")
    })
    FavPlacesDTO toDto(FavPlaces favPlaces);

    @Mappings({
            @Mapping(target = "places.id", source = "place.id"),
            @Mapping(target = "users.id", source = "user.id")
    })
    FavPlaces toModel(FavPlacesDTO favPlacesDTO);

    List<FavPlacesDTO> toDtoList(List<FavPlaces> favPlaces);

    List<FavPlaces> toModelList(List<FavPlacesDTO> favPlacesDTOS);
}

package tourismback.mapper.favorite;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import tourismback.dto.favorite.FavHotelsDTO;
import tourismback.entity.favorite.FavHotels;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FavHotelsMapper {
    @Mappings({
            @Mapping(target = "hotel.id", source = "hotels.id"),
            @Mapping(target = "user.id", source = "users.id")
    })
    FavHotelsDTO toDto(FavHotels favHotels);

    @Mappings({
            @Mapping(target = "hotels.id", source = "hotel.id"),
            @Mapping(target = "users.id", source = "user.id")
    })
    FavHotels toModel(FavHotelsDTO favHotelsDTO);

    List<FavHotelsDTO> toDtoList(List<FavHotels> favHotels);

    List<FavHotels> toModelList(List<FavHotelsDTO> favHotelsDTOS);
}

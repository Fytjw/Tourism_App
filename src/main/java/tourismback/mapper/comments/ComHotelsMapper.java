package tourismback.mapper.comments;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import tourismback.dto.comments.ComHotelsDTO;
import tourismback.entity.comments.ComHotels;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ComHotelsMapper {
    @Mappings({
            @Mapping(target = "hotel.id", source = "hotels.id"),
            @Mapping(target = "user.id", source = "users.id")
    })
    ComHotelsDTO toDto(ComHotels comHotels);

    @Mappings({
            @Mapping(target = "hotels.id", source = "hotel.id"),
            @Mapping(target = "users.id", source = "user.id")
    })
    ComHotels toModel(ComHotelsDTO comHotelsDTO);

    List<ComHotelsDTO> toDtoList(List<ComHotels> comHotels);

    List<ComHotels> toModelList(List<ComHotelsDTO> comHotelsDTOS);
}

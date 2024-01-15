package tourismback.mapper.hotels;

import org.mapstruct.Mapper;
import tourismback.dto.hotels.HotelsDTO;
import tourismback.entity.hotels.Hotels;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HotelsMapper {
    HotelsDTO toDto(Hotels hotels);

    Hotels toModel(HotelsDTO hotelsDTO);

    List<HotelsDTO> toDtoList(List<Hotels> hotels);

    List<Hotels> toModelList(List<HotelsDTO> hotelsDTOS);
}

package tourismback.mapper.comments;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import tourismback.dto.comments.ComRestaurantsDTO;
import tourismback.entity.comments.ComRestaurants;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ComRestaurantsMapper {
    @Mappings({
            @Mapping(target = "restaurant.id", source = "restaurants.id"),
            @Mapping(target = "user.id", source = "users.id")
    })
    ComRestaurantsDTO toDto(ComRestaurants comRestaurants);

    @Mappings({
            @Mapping(target = "restaurants.id", source = "restaurant.id"),
            @Mapping(target = "users.id", source = "user.id")
    })
    ComRestaurants toModel(ComRestaurantsDTO comRestaurantsDTO);

    List<ComRestaurantsDTO> toDtoList(List<ComRestaurants> comRestaurants);

    List<ComRestaurants> toModelList(List<ComRestaurantsDTO> comRestaurantsDTOS);
}

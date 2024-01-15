package tourismback.mapper.restaurants;

import org.mapstruct.Mapper;
import tourismback.dto.restaurants.RestaurantsDTO;
import tourismback.entity.restaurants.Restaurants;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RestaurantsMapper {
    RestaurantsDTO toDto (Restaurants restaurants);

    Restaurants toModel (RestaurantsDTO restaurantsDTO);

    List<RestaurantsDTO> toDtoList(List<Restaurants>  restaurants);

    List<Restaurants> toModelList(List<RestaurantsDTO> restaurantsDTO);
}

package tourismback.mapper.favorite;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import tourismback.models.dto.favorite.FavRestaurantsDTO;
import tourismback.entity.favorite.FavRestaurants;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FavRestaurantsMapper {

    @Mappings({
            @Mapping(target = "restaurant.id", source = "restaurants.id"),
            @Mapping(target = "user.id", source = "users.id")
    })
    FavRestaurantsDTO toDto(FavRestaurants favRestaurants);

    @Mappings({
            @Mapping(target = "restaurants.id", source = "restaurant.id"),
            @Mapping(target = "users.id", source = "user.id")
    })
    FavRestaurants toModel(FavRestaurantsDTO favRestaurantsDTO);

    List<FavRestaurantsDTO> toDtoList(List<FavRestaurants> restaurants);

    List<FavRestaurants> toModelList(List<FavRestaurantsDTO> restaurantsDTOS);
}

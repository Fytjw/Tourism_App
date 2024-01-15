package tourismback.mapper.restaurants;

import org.mapstruct.Mapper;
import tourismback.dto.restaurants.FoodDTO;
import tourismback.entity.restaurants.Food;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FoodMapper {
    FoodDTO toDto(Food food);

    Food toModel(FoodDTO foodDTO);

    List<FoodDTO> toDtoList(List<Food> foods);

    List<Food> toModelList(List<FoodDTO> foodDTOS);
}

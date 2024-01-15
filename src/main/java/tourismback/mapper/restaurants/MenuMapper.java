package tourismback.mapper.restaurants;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import tourismback.dto.restaurants.MenuDTO;
import tourismback.entity.restaurants.Menu;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MenuMapper {

    @Mappings({
            @Mapping(target = "restaurant.id", source = "restaurants.id"),
            @Mapping(target = "foods", source = "foods")
    })
    MenuDTO toDto(Menu menu);

    @Mappings({
            @Mapping(target = "restaurants.id", source = "restaurant.id"),
            @Mapping(target = "foods", source = "foods")
    })
    Menu toModel(MenuDTO menuDTO);

    List<MenuDTO> toDtoList(List<Menu> menus);

    List<Menu> toModelList(List<MenuDTO> menuDTOS);
}

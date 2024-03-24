package tourismback.service.restaurants;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tourismback.models.dto.restaurants.FoodDTO;
import tourismback.models.dto.restaurants.MenuDTO;
import tourismback.mapper.restaurants.MenuMapper;
import tourismback.repository.restaurants.MenuRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuService {
    private final MenuRepository menuRepository;
    private final MenuMapper menuMapper;
    private final FoodService foodService;

    public List<MenuDTO> getAllMenus(){
        return menuMapper.toDtoList(menuRepository.findAll());
    }

    public MenuDTO getMenu(Long id){
        return menuMapper.toDto(menuRepository.findById(id).orElseThrow());
    }

    public MenuDTO addMenu(MenuDTO menuDTO){
        List<FoodDTO> newFoods = new ArrayList<>();
        for(FoodDTO food: menuDTO.getFoods()){
            newFoods.add(foodService.addFood(food));
        }
        menuDTO.setFoods(newFoods);
        return menuMapper.toDto(menuRepository.save(menuMapper.toModel(menuDTO)));
    }

    public MenuDTO updateMenu(MenuDTO menuDTO){
        return menuMapper.toDto(menuRepository.save(menuMapper.toModel(menuDTO)));
    }

    public void deleteMenu(Long id){
        menuRepository.deleteById(id);
    }
}

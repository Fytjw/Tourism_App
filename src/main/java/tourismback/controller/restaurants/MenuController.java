package tourismback.controller.restaurants;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tourismback.dto.restaurants.MenuDTO;
import tourismback.service.restaurants.MenuService;

import java.util.List;

@RestController
@RequestMapping("menus")
@RequiredArgsConstructor
public class MenuController {
    private final MenuService menuService;

    @GetMapping
    public List<MenuDTO> getAllMenus(){
        return menuService.getAllMenus();
    }

    @GetMapping("menu/{id}")
    public MenuDTO getMenu(
            @PathVariable(name = "id") Long id
    ){
        return menuService.getMenu(id);
    }

    @PostMapping
    public MenuDTO addMenu(
            @RequestBody MenuDTO menuDTO
    ){
        return menuService.addMenu(menuDTO);
    }

    @PutMapping
    public MenuDTO updateMenu(
            @RequestBody MenuDTO menuDTO
    ){
        return menuService.updateMenu(menuDTO);
    }

    @DeleteMapping
    public void deleteMenu(
            @PathVariable(name = "id") Long id
    ){
        menuService.deleteMenu(id);
    }
}

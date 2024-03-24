package tourismback.controller.restaurants;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tourismback.models.dto.restaurants.FoodDTO;
import tourismback.service.restaurants.FoodService;

import java.util.List;

@RestController
@RequestMapping("foods")
@RequiredArgsConstructor
public class FoodController {
    private final FoodService foodService;

    @GetMapping
    public List<FoodDTO> getAllFoods(){
        return foodService.getAllFoods();
    }

    @GetMapping("food/{id}")
    public FoodDTO getFood(
            @PathVariable(name = "id") Long id
    ){
        return foodService.getFood(id);
    }

    @PostMapping
    public FoodDTO addFood(
            @RequestBody FoodDTO foodDTO
    ){
        return foodService.addFood(foodDTO);
    }

    @PutMapping
    public FoodDTO updateFood(
            @RequestBody FoodDTO foodDTO
    ){
        return foodService.updateFood(foodDTO);
    }

    @DeleteMapping
    public void deleteFood(
            @PathVariable(name = "id") Long id
    ){
        foodService.deleteFood(id);
    }
}

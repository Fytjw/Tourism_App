package tourismback.service.restaurants;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tourismback.dto.restaurants.FoodDTO;
import tourismback.mapper.restaurants.FoodMapper;
import tourismback.repository.restaurants.FoodRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodService {
    private final FoodRepository foodRepository;
    private final FoodMapper foodMapper;

    public List<FoodDTO> getAllFoods(){
        return foodMapper.toDtoList(foodRepository.findAll());
    }

    public FoodDTO getFood(Long id){
        return foodMapper.toDto(foodRepository.findById(id).orElseThrow());
    }

    public FoodDTO addFood(FoodDTO foodDTO){
        return foodMapper.toDto(foodRepository.save(foodMapper.toModel(foodDTO)));
    }

    public FoodDTO updateFood(FoodDTO foodDTO){
        return foodMapper.toDto(foodRepository.save(foodMapper.toModel(foodDTO)));
    }

    public void deleteFood(Long id){ foodRepository.deleteById(id); }
}

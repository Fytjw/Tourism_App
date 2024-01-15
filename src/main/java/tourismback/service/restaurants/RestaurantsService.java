package tourismback.service.restaurants;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tourismback.dto.restaurants.RestaurantsDTO;
import tourismback.mapper.restaurants.RestaurantsMapper;
import tourismback.repository.restaurants.RestaurantsRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantsService {
    private final RestaurantsRepository restaurantsRepository;
    private final RestaurantsMapper restaurantsMapper;

    public List<RestaurantsDTO> getAllRestaurants(){
        return restaurantsMapper.toDtoList(restaurantsRepository.findAll());
    }

    public RestaurantsDTO getRestaurants(Long id){
        return restaurantsMapper.toDto(restaurantsRepository.findById(id).orElseThrow());
    }

    public RestaurantsDTO addRestaurants(RestaurantsDTO restaurantsDTO){
        return restaurantsMapper.toDto(restaurantsRepository.save(restaurantsMapper.toModel(restaurantsDTO)));
    }

    public RestaurantsDTO updateRestaurants(RestaurantsDTO restaurantsDTO){
        return restaurantsMapper.toDto(restaurantsRepository.save(restaurantsMapper.toModel(restaurantsDTO)));
    }

    public void deleteRestaurants(Long id) { restaurantsRepository.deleteById(id); }
}

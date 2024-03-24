package tourismback.service.favorite;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tourismback.models.dto.favorite.FavRestaurantsDTO;
import tourismback.mapper.favorite.FavRestaurantsMapper;
import tourismback.repository.favorite.FavRestaurantsRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FavRestaurantsService {
    private final FavRestaurantsRepository favRestaurantsRepository;
    private final FavRestaurantsMapper favRestaurantsMapper;

    public List<FavRestaurantsDTO> getAllFavRestaurants(){
        return favRestaurantsMapper.toDtoList(favRestaurantsRepository.findAll());
    }

    public FavRestaurantsDTO getFavRestaurants(Long id){
        return favRestaurantsMapper.toDto(favRestaurantsRepository.findById(id).orElseThrow());
    }

    public FavRestaurantsDTO addFavRestaurants(FavRestaurantsDTO favRestaurantsDTO){
        return favRestaurantsMapper.toDto(favRestaurantsRepository.save(favRestaurantsMapper.toModel(favRestaurantsDTO)));
    }

    public FavRestaurantsDTO updateFavRestaurants(FavRestaurantsDTO favRestaurantsDTO){
        return favRestaurantsMapper.toDto(favRestaurantsRepository.save(favRestaurantsMapper.toModel(favRestaurantsDTO)));
    }

    public void deleteFavRestaurants(Long id){ favRestaurantsRepository.deleteById(id); }
}

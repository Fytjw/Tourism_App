package tourismback.service.favorite;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tourismback.dto.favorite.FavPlacesDTO;
import tourismback.mapper.favorite.FavPlacesMapper;
import tourismback.repository.favorite.FavPlacesRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FavPlacesService {
    private final FavPlacesRepository favPlacesRepository;
    private final FavPlacesMapper favPlacesMapper;

    public List<FavPlacesDTO> getAllFavPlaces(){
        return favPlacesMapper.toDtoList(favPlacesRepository.findAll());
    }

    public FavPlacesDTO getFavPlaces(Long id){
        return favPlacesMapper.toDto(favPlacesRepository.findById(id).orElseThrow());
    }

    public FavPlacesDTO addFavPlaces(FavPlacesDTO favPlacesDTO){
        return favPlacesMapper.toDto(favPlacesRepository.save(favPlacesMapper.toModel(favPlacesDTO)));
    }

    public FavPlacesDTO updateFavPlaces(FavPlacesDTO favPlacesDTO){
        return favPlacesMapper.toDto(favPlacesRepository.save(favPlacesMapper.toModel(favPlacesDTO)));
    }

    public void deleteFavPlaces(Long id){ favPlacesRepository.deleteById(id);}
}

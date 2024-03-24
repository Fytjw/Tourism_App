package tourismback.service.favorite;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tourismback.models.dto.favorite.FavHotelsDTO;
import tourismback.mapper.favorite.FavHotelsMapper;
import tourismback.repository.favorite.FavHotelsRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FavHotelsService {

    private final FavHotelsRepository favHotelsRepository;
    private final FavHotelsMapper favHotelsMapper;

    public List<FavHotelsDTO> getAllFavHotels(){
        return favHotelsMapper.toDtoList(favHotelsRepository.findAll());
    }

    public FavHotelsDTO getFavHotels(Long id){
        return favHotelsMapper.toDto(favHotelsRepository.findById(id).orElseThrow());
    }

    public FavHotelsDTO addFavHotels(FavHotelsDTO favHotelsDTO){
        return favHotelsMapper.toDto(favHotelsRepository.save(favHotelsMapper.toModel(favHotelsDTO)));
    }

    public FavHotelsDTO updateHotels(FavHotelsDTO favHotelsDTO){
        return favHotelsMapper.toDto(favHotelsRepository.save(favHotelsMapper.toModel(favHotelsDTO)));
    }

    public void deleteHotels(Long id){ favHotelsRepository.deleteById(id); }
}

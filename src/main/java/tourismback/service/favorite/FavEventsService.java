package tourismback.service.favorite;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tourismback.models.dto.favorite.FavEventsDTO;
import tourismback.mapper.favorite.FavEventsMapper;
import tourismback.repository.favorite.FavEventsRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FavEventsService {
    private final FavEventsRepository favEventsRepository;
    private final FavEventsMapper favEventsMapper;

    public List<FavEventsDTO> getAllFavEvents(){
        return favEventsMapper.toDtoList(favEventsRepository.findAll());
    }

    public FavEventsDTO getFavEvents(Long id){
        return favEventsMapper.toDto(favEventsRepository.findById(id).orElseThrow());
    }

    public FavEventsDTO addFavEvents(FavEventsDTO favEventsDTO){
        return favEventsMapper.toDto(favEventsRepository.save(favEventsMapper.toModel(favEventsDTO)));
    }

    public FavEventsDTO updateFavEvents(FavEventsDTO favEventsDTO){
        return favEventsMapper.toDto(favEventsRepository.save(favEventsMapper.toModel(favEventsDTO)));
    }

    public void deleteFavEvents(Long id){ favEventsRepository.deleteById(id); }
}

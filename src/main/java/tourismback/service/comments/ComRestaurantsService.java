package tourismback.service.comments;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tourismback.dto.comments.ComRestaurantsDTO;
import tourismback.mapper.comments.ComRestaurantsMapper;
import tourismback.repository.comments.ComRestaurantsRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ComRestaurantsService {
    private final ComRestaurantsRepository comRestaurantsRepository;
    private final ComRestaurantsMapper comRestaurantsMapper;

    public List<ComRestaurantsDTO> getAllComRestaurants(){
        return comRestaurantsMapper.toDtoList(comRestaurantsRepository.findAll());
    }

    public ComRestaurantsDTO getComRestaurants(Long id){
        return comRestaurantsMapper.toDto(comRestaurantsRepository.findById(id).orElseThrow());
    }

    public ComRestaurantsDTO addComRestaurants(ComRestaurantsDTO comRestaurantsDTO){
        return comRestaurantsMapper.toDto(comRestaurantsRepository.save(comRestaurantsMapper.toModel(comRestaurantsDTO)));
    }

    public ComRestaurantsDTO updateComRestaurants(ComRestaurantsDTO comRestaurantsDTO){
        return comRestaurantsMapper.toDto(comRestaurantsRepository.save(comRestaurantsMapper.toModel(comRestaurantsDTO)));
    }

    public void deleteComRestaurants(Long id){ comRestaurantsRepository.deleteById(id); }
}

package tourismback.service.places;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tourismback.models.dto.places.PlacesDTO;
import tourismback.mapper.places.PlacesMapper;
import tourismback.repository.places.PlacesRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlacesService {
    private final PlacesRepository placesRepository;
    private final PlacesMapper placesMapper;

    public List<PlacesDTO> getAllPlaces(){
        return placesMapper.toDtoList(placesRepository.findAll());
    }

    public PlacesDTO getPlaces(Long id){
        return placesMapper.toDto(placesRepository.findById(id).orElseThrow());
    }

    public PlacesDTO addPlaces(PlacesDTO placesDTO){
        return placesMapper.toDto(placesRepository.save(placesMapper.toModel(placesDTO)));
    }

    public PlacesDTO updatePlaces(PlacesDTO placesDTO){
        return placesMapper.toDto(placesRepository.save(placesMapper.toModel(placesDTO)));
    }

    public void deletePlaces(Long id){
        placesRepository.deleteById(id);
    }
}

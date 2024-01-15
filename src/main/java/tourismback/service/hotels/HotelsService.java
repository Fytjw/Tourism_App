package tourismback.service.hotels;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tourismback.dto.hotels.HotelsDTO;
import tourismback.mapper.hotels.HotelsMapper;
import tourismback.repository.hotels.HotelsRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HotelsService {
    private final HotelsRepository hotelsRepository;
    private final HotelsMapper hotelsMapper;

    public List<HotelsDTO> getAllHotels(){
        return hotelsMapper.toDtoList(hotelsRepository.findAll());
    }

    public HotelsDTO getHotels(Long id){
        return hotelsMapper.toDto(hotelsRepository.findById(id).orElseThrow());
    }

    public HotelsDTO addHotels(HotelsDTO hotelsDTO){
        return hotelsMapper.toDto(hotelsRepository.save(hotelsMapper.toModel(hotelsDTO)));
    }

    public HotelsDTO updateHotels(HotelsDTO hotelsDTO){
        return hotelsMapper.toDto(hotelsRepository.save(hotelsMapper.toModel(hotelsDTO)));
    }

    public void deleteHotels(Long id){ hotelsRepository.deleteById(id); }
}

package tourismback.service.hotels;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import tourismback.entity.auth.Users;
import tourismback.entity.hotels.Hotels;
import tourismback.models.dto.hotels.HotelsDTO;
import tourismback.mapper.hotels.HotelsMapper;
import tourismback.repository.hotels.HotelsRepository;

import java.io.IOException;
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


    public void saveAvatar(MultipartFile file, Long id) throws IOException {
        Hotels hotels= hotelsRepository.findById(id).orElse(new Hotels());
        hotels.setImage(file.getBytes());
        hotelsRepository.save(hotels);
    }

    public byte[] getImageByUserId(Long id) {
        return hotelsRepository.findById(id).orElse(new Hotels()).getImage();
    }
}

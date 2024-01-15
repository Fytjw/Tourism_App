package tourismback.dto.favorite;

import lombok.Data;
import tourismback.dto.auth.UsersDTO;
import tourismback.dto.hotels.HotelsDTO;

@Data
public class FavHotelsDTO {
    private Long id;
    private HotelsDTO hotel;
    private UsersDTO user;
}

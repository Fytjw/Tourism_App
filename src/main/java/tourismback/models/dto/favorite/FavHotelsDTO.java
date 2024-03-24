package tourismback.models.dto.favorite;

import lombok.Data;
import tourismback.models.dto.auth.UsersDTO;
import tourismback.models.dto.hotels.HotelsDTO;

@Data
public class FavHotelsDTO {
    private Long id;
    private HotelsDTO hotel;
    private UsersDTO user;
}

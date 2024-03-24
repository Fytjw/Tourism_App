package tourismback.models.dto.favorite;

import lombok.Data;
import tourismback.models.dto.auth.UsersDTO;
import tourismback.models.dto.events.EventsDTO;

@Data
public class FavEventsDTO {
    private Long id;
    private EventsDTO event;
    private UsersDTO user;
}

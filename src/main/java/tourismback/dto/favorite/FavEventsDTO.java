package tourismback.dto.favorite;

import lombok.Data;
import tourismback.dto.auth.UsersDTO;
import tourismback.dto.events.EventsDTO;

@Data
public class FavEventsDTO {
    private Long id;
    private EventsDTO event;
    private UsersDTO user;
}

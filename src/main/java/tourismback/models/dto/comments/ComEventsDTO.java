package tourismback.models.dto.comments;

import lombok.Data;
import tourismback.models.dto.auth.UsersDTO;
import tourismback.models.dto.events.EventsDTO;

@Data
public class ComEventsDTO {
    private Long id;
    private String message;
    private int rating;
    private EventsDTO event;
    private UsersDTO user;
}

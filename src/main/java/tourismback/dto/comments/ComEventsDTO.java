package tourismback.dto.comments;

import lombok.Data;
import tourismback.dto.auth.UsersDTO;
import tourismback.dto.events.EventsDTO;

@Data
public class ComEventsDTO {
    private Long id;
    private String message;
    private int rating;
    private EventsDTO event;
    private UsersDTO user;
}

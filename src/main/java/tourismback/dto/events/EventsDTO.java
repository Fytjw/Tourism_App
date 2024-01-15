package tourismback.dto.events;

import lombok.Data;

import java.util.Date;

@Data
public class EventsDTO {
    private Long id;
    private String name;
    private int rating;
    private String description;
    private double longitude;
    private double latitude;
    private String address;
    private Date date;
}

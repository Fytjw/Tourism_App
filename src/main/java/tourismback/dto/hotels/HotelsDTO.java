package tourismback.dto.hotels;

import lombok.Data;

@Data
public class HotelsDTO {
    private Long id;
    private String name;
    private int rating;
    private String description;
    private double longitude;
    private double latitude;
    private String address;
}

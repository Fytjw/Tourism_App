package tourismback.models.dto.restaurants;

import lombok.Data;

@Data
public class RestaurantsDTO {
    private Long id;
    private String name;
    private int rating;
    private String description;
    private double longitude;
    private double latitude;
    private String address;
    private int avgBil;
    private String city;
}

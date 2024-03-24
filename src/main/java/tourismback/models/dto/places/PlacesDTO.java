package tourismback.models.dto.places;

import lombok.Data;

@Data
public class PlacesDTO {
    private Long id;
    private String name;
    private int rating;
    private String description;
    private double longitude;
    private double latitude;
    private String address;
    private String city;
}

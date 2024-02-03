package tourismback.entity.favorite;

import jakarta.persistence.*;
import lombok.Data;
import tourismback.entity.auth.Users;
import tourismback.entity.places.Places;

@Entity
@Data
@Table(name = "fav_places")
public class FavPlaces {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "places_id")
    private Places places;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
}

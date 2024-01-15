package tourismback.entity.favorite;

import jakarta.persistence.*;
import lombok.Data;
import tourismback.entity.auth.Users;
import tourismback.entity.hotels.Hotels;

@Entity
@Data
@Table(name = "fav_hotels")
public class FavHotels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "hotels_id")
    private Hotels hotels;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
}

package tourismback.entity.favorite;

import jakarta.persistence.*;
import lombok.Data;
import tourismback.entity.auth.Users;
import tourismback.entity.restaurants.Restaurants;

@Entity
@Data
@Table(name = "fav_restaurants")
public class FavRestaurants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "restaurants_id")
    private Restaurants restaurants;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
}

package tourismback.entity.comments;

import jakarta.persistence.*;
import lombok.Data;
import tourismback.entity.auth.Users;
import tourismback.entity.restaurants.Restaurants;

@Entity
@Data
@Table(name = "comment_restaurants")
public class ComRestaurants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "message")
    private String message;

    @Column(name = "rating")
    private int rating;

    @ManyToOne
    @JoinColumn(name = "restaurants_id")
    private Restaurants restaurants;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
}

package tourismback.entity.comments;

import jakarta.persistence.*;
import lombok.Data;
import tourismback.entity.auth.Users;
import tourismback.entity.places.Places;

@Entity
@Data
@Table(name = "comment_places")
public class ComPlaces {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "message")
    private String message;

    @Column(name = "rating")
    private int rating;

    @ManyToOne
    @JoinColumn(name = "places_id")
    private Places places;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
}

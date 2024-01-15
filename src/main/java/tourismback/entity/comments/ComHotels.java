package tourismback.entity.comments;

import jakarta.persistence.*;
import lombok.Data;
import tourismback.entity.auth.Users;
import tourismback.entity.hotels.Hotels;

@Entity
@Data
@Table(name = "comment_hotels")
public class ComHotels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "message")
    private String message;

    @Column(name = "rating")
    private int rating;

    @ManyToOne
    @JoinColumn(name = "hotels_id")
    private Hotels hotels;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
}

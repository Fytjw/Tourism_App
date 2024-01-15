package tourismback.entity.comments;

import jakarta.persistence.*;
import lombok.Data;
import tourismback.entity.auth.Users;
import tourismback.entity.events.Events;

@Entity
@Data
@Table(name = "comment_events")
public class ComEvents {

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
    private Events events;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
}

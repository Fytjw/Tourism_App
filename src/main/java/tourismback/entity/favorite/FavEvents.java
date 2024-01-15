package tourismback.entity.favorite;

import jakarta.persistence.*;
import lombok.Data;
import tourismback.entity.auth.Users;
import tourismback.entity.events.Events;

@Entity
@Data
@Table(name = "fav_events")
public class FavEvents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "events_id")
    private Events events;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
}

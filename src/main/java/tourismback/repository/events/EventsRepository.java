package tourismback.repository.events;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tourismback.entity.events.Events;

@Repository
public interface EventsRepository extends JpaRepository<Events, Long> {
}

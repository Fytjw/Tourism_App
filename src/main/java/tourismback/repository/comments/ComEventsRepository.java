package tourismback.repository.comments;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tourismback.entity.comments.ComEvents;

@Repository
public interface ComEventsRepository extends JpaRepository<ComEvents, Long> {
}

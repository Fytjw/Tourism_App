package tourismback.repository.favorite;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tourismback.entity.favorite.FavEvents;

@Repository
public interface FavEventsRepository extends JpaRepository<FavEvents, Long> {
}

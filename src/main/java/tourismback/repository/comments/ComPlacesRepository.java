package tourismback.repository.comments;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tourismback.entity.comments.ComPlaces;

@Repository
public interface ComPlacesRepository extends JpaRepository<ComPlaces, Long> {
}

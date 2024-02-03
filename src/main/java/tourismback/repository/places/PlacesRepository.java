package tourismback.repository.places;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tourismback.entity.places.Places;

@Repository
public interface PlacesRepository extends JpaRepository<Places, Long> {
}

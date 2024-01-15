package tourismback.repository.hotels;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tourismback.entity.hotels.Hotels;

@Repository
public interface HotelsRepository extends JpaRepository<Hotels, Long> {
}

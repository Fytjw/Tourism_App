package tourismback.repository.comments;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tourismback.entity.comments.ComHotels;

@Repository
public interface ComHotelsRepository extends JpaRepository<ComHotels, Long> {
}

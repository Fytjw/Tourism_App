package tourismback.repository.comments;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tourismback.entity.comments.ComRestaurants;

@Repository
public interface ComRestaurantsRepository extends JpaRepository<ComRestaurants, Long> {
}

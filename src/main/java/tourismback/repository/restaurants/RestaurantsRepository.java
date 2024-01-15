package tourismback.repository.restaurants;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tourismback.entity.restaurants.Restaurants;

@Repository
public interface RestaurantsRepository extends JpaRepository<Restaurants, Long> {
}

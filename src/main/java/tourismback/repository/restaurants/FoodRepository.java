package tourismback.repository.restaurants;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tourismback.entity.restaurants.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
}

package tourismback.repository.restaurants;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tourismback.entity.restaurants.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
}

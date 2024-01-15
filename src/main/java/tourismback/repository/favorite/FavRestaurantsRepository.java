package tourismback.repository.favorite;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tourismback.entity.favorite.FavRestaurants;

@Repository
public interface FavRestaurantsRepository extends JpaRepository<FavRestaurants, Long> {
}

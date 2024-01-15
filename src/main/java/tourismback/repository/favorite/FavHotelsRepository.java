package tourismback.repository.favorite;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tourismback.entity.favorite.FavHotels;

@Repository
public interface FavHotelsRepository extends JpaRepository<FavHotels, Long> {
}

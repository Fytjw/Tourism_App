package tourismback.repository.favorite;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tourismback.entity.favorite.FavPlaces;

@Repository
public interface FavPlacesRepository extends JpaRepository<FavPlaces, Long> {
}

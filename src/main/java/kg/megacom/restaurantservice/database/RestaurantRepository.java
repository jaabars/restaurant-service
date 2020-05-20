package kg.megacom.restaurantservice.database;

import kg.megacom.restaurantservice.model.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
}

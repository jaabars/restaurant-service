package kg.megacom.restaurantservice.database;

import kg.megacom.restaurantservice.model.entity.RestaurantOrders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantOrderIdRepository extends JpaRepository<RestaurantOrders,Long> {
}

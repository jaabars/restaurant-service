package kg.megacom.restaurantservice.database;

import kg.megacom.restaurantservice.model.entity.OrderHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderStatusRepository extends JpaRepository<OrderHistory, Long> {
}

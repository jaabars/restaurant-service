package kg.megacom.restaurantservice.database;

import kg.megacom.restaurantservice.model.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends JpaRepository<Phone,Long> {
}

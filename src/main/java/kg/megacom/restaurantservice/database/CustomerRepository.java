package kg.megacom.restaurantservice.database;

import kg.megacom.restaurantservice.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    int countByPhoneAndPassword(String phone,String pass);
}

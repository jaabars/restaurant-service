package kg.megacom.restaurantservice.database;

import kg.megacom.restaurantservice.model.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishRepository extends JpaRepository<Dish,Long> {
     List<Dish> findAllByMenuId(Long id);

}

package kg.megacom.restaurantservice.database;

import kg.megacom.restaurantservice.model.entity.UserSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public  interface  UserSessionRepository extends JpaRepository<UserSession,Long> {
}

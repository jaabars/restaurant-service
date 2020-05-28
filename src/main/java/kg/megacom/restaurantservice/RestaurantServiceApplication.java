package kg.megacom.restaurantservice;

import kg.megacom.restaurantservice.timer.CustomerTokenCleaner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  RestaurantServiceApplication {

    public  static void main(String[] args) {
        SpringApplication.run(RestaurantServiceApplication.class, args);
    }

}

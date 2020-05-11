package kg.megacom.restaurantservice.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "restaurant_order_id")
public class RestaurantOrderId {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    //@Column(name = "restaurant_id")
    private Restaurant restaurant;
    @OneToOne
    //@Column(name = "order_id")
    private Order order;
    private boolean isReady;
    private Date startDate;
    private Date endDate;
}

package kg.megacom.restaurantservice.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "order_details")
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @OneToOne
    private Dish dish;
    private int amount;
}

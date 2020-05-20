package kg.megacom.restaurantservice.model.entity;

import kg.megacom.restaurantservice.enums.OrderStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "order_history")
public class OrderHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date startDate;
    private Date endDate;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id")
    private Order order;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;
    @Enumerated(value = EnumType.STRING)
    private OrderStatus orderStatus;

}

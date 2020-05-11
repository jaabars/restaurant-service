package kg.megacom.restaurantservice.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double price;
    private Date startDate;
    private Date endDate;
    @OneToOne
    @JoinColumn(name = "dish_id")
    private Dish dish;
}

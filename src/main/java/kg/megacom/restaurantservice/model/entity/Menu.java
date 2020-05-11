package kg.megacom.restaurantservice.model.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Restaurant restaurant;
}

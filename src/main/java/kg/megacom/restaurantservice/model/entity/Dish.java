package kg.megacom.restaurantservice.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "dishes")
@Data
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private double size;
    private String imgPath;
    private boolean active;
    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;
}

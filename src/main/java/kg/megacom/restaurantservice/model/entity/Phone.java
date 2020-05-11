package kg.megacom.restaurantservice.model.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "phones")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String phone;
    private boolean active;
    private boolean main;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}

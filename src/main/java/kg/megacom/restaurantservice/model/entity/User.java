package kg.megacom.restaurantservice.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private boolean active;
    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;
}

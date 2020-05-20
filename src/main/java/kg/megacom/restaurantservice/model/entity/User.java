package kg.megacom.restaurantservice.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private boolean active;
    @OneToOne
    @JoinColumn(name = "position_id")
    private Position position;
    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Phone> phones;
}

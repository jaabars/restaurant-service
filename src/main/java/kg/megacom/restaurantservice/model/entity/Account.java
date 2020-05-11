package kg.megacom.restaurantservice.model.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String login;
    private String password;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}

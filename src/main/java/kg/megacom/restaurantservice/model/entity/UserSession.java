package kg.megacom.restaurantservice.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "user_sessions")
public class UserSession {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String sessionID;
    @OneToOne
    private Customer customer;
    private Date startDate;
    private Date endDate;
    private String token;
}

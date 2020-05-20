package kg.megacom.restaurantservice.model.entity;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private int houseNo;
    private int flatNo;
    private String phone;
    private String password;
}

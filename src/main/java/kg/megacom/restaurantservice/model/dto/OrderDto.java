package kg.megacom.restaurantservice.model.dto;


import lombok.Data;


import java.util.Date;

@Data
public class OrderDto {
    private Long id;
    private Date createDate;
    private double cost;

    private CustomerDto customer;
}

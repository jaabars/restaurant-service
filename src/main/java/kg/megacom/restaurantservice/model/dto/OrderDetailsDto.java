package kg.megacom.restaurantservice.model.dto;



import lombok.Data;


import java.util.List;
@Data
public class OrderDetailsDto {
    private Long id;

    private OrderDto order;

    private DishDto dish;

    private int amount;
}

package kg.megacom.restaurantservice.model.dto;


import kg.megacom.restaurantservice.model.entity.Order;
import lombok.Data;


import java.util.List;
@Data
public class OrderDetailsDto {
    private Long id;

    private OrderDto order;

    private List<DishDto> dish;

    private int amount;
}

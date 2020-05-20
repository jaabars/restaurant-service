package kg.megacom.restaurantservice.services;

import kg.megacom.restaurantservice.model.dto.OrderDetailsDto;

import java.util.List;

public interface OrderDetailsService {
    OrderDetailsDto saveOrderDetails(OrderDetailsDto orderDetailsDto);
    List<OrderDetailsDto> getOrderDetailsList();
}

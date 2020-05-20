package kg.megacom.restaurantservice.services;

import kg.megacom.restaurantservice.model.dto.OrderDto;

import java.util.List;

public interface OrderService {
    OrderDto saveOrder(OrderDto orderDto);
    List<OrderDto> getOrderList();
}

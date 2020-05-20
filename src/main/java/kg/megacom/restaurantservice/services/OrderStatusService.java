package kg.megacom.restaurantservice.services;

import kg.megacom.restaurantservice.model.dto.OrderHistoryDto;

import java.util.List;

public interface OrderStatusService {
    OrderHistoryDto saveOrderStatus(OrderHistoryDto orderHistoryDto);
    List<OrderHistoryDto> getOrderStatusList ();
}

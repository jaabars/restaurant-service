package kg.megacom.restaurantservice.mappers;

import kg.megacom.restaurantservice.model.dto.OrderDto;
import kg.megacom.restaurantservice.model.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order orderDtoToOrder (OrderDto orderDto);
    OrderDto orderToOrderDto(Order order);
    List<Order> orderDtoListToOrderList(List<OrderDto> orderDtoList);
    List<OrderDto> orderListToOrderDtoList(List<Order> orderList);
}

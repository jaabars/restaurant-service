package kg.megacom.restaurantservice.services.impl;

import kg.megacom.restaurantservice.database.OrderRepository;
import kg.megacom.restaurantservice.mappers.OrderMapper;
import kg.megacom.restaurantservice.model.dto.OrderDto;
import kg.megacom.restaurantservice.model.entity.Order;
import kg.megacom.restaurantservice.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public OrderDto saveOrder(OrderDto orderDto) {
        Order order = OrderMapper.INSTANCE.orderDtoToOrder(orderDto);
        order = orderRepository.save(order);
        orderDto = OrderMapper.INSTANCE.orderToOrderDto(order);
        return orderDto;
    }

    @Override
    public List<OrderDto> getOrderList() {
        List<Order> orderList = orderRepository.findAll();
        List<OrderDto> orderDtoList = OrderMapper.INSTANCE.orderListToOrderDtoList(orderList);
        return orderDtoList;
    }
}

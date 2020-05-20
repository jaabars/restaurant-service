package kg.megacom.restaurantservice.services.impl;

import kg.megacom.restaurantservice.database.OrderStatusRepository;
import kg.megacom.restaurantservice.mappers.OrderHistoryMapper;
import kg.megacom.restaurantservice.model.dto.OrderHistoryDto;
import kg.megacom.restaurantservice.model.entity.OrderHistory;
import kg.megacom.restaurantservice.services.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderStatusServiceImpl implements OrderStatusService {
    @Autowired
    private OrderStatusRepository orderStatusRepository;
    @Override
    public OrderHistoryDto saveOrderStatus(OrderHistoryDto orderHistoryDto) {
        OrderHistory orderHistory = OrderHistoryMapper.INSTANCE.orderStatusDtoToOrderStatus(orderHistoryDto);
        orderHistory = orderStatusRepository.save(orderHistory);
        orderHistoryDto = OrderHistoryMapper.INSTANCE.orderStatusToOrderStatusDto(orderHistory);
        return orderHistoryDto;
    }

    @Override
    public List<OrderHistoryDto> getOrderStatusList() {
        List<OrderHistory> orderHistoryList = orderStatusRepository.findAll();
        List<OrderHistoryDto> orderHistoryDtoList = OrderHistoryMapper.INSTANCE.orderStatusListToOrderStatusDtoList(orderHistoryList);
        return orderHistoryDtoList;
    }
}

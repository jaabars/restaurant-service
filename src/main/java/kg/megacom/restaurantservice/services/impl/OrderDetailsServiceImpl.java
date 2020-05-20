package kg.megacom.restaurantservice.services.impl;

import kg.megacom.restaurantservice.database.OrderDetailsRepository;
import kg.megacom.restaurantservice.mappers.OrderDetailsMapper;
import kg.megacom.restaurantservice.model.dto.OrderDetailsDto;

import kg.megacom.restaurantservice.model.entity.OrderDetails;

import kg.megacom.restaurantservice.services.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {
    @Autowired
    private OrderDetailsRepository orderDetailsRepository;
    @Override
    public OrderDetailsDto saveOrderDetails(OrderDetailsDto orderDetailsDto) {
        OrderDetails orderDetails = OrderDetailsMapper.INSTANCE.orderDetailsDtoToOrderDetails(orderDetailsDto);
        orderDetails = orderDetailsRepository.save(orderDetails);
        orderDetailsDto = OrderDetailsMapper.INSTANCE.orderDetailsToOrderDetailsDto(orderDetails);

        return orderDetailsDto;
    }

    @Override
    public List<OrderDetailsDto> getOrderDetailsList() {
        List<OrderDetails> orderDetailsList = orderDetailsRepository.findAll();
        List<OrderDetailsDto> orderDetailsDtoList = OrderDetailsMapper.INSTANCE.orderDetailsListToOrderDetailsDto(orderDetailsList);
        return orderDetailsDtoList;
    }
}

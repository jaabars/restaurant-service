package kg.megacom.restaurantservice;

import kg.megacom.restaurantservice.mappers.OrderMapper;
import kg.megacom.restaurantservice.model.dto.OrderDto;
import kg.megacom.restaurantservice.model.entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestMapperOrder {
    @Test
    public void orderTest(){
        OrderDto orderDto=new OrderDto();
        orderDto.setCost(200);
        orderDto.setCreateDate(new Date());
        Order order= OrderMapper.INSTANCE.orderDtoToOrder(orderDto);
        OrderDto found=OrderMapper.INSTANCE.orderToOrderDto(order);
        assertEquals(found.getCost(),orderDto.getCost(),0.1);
        assertEquals(found.getCreateDate(),orderDto.getCreateDate());

    }
}

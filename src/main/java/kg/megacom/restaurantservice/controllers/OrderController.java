package kg.megacom.restaurantservice.controllers;

import kg.megacom.restaurantservice.model.dto.OrderDto;
import kg.megacom.restaurantservice.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public OrderDto saveOrder(@RequestBody OrderDto orderDto){
        return orderService.saveOrder(orderDto);
    }
    @GetMapping("/get")
    public List<OrderDto> getOrderList(){
        return orderService.getOrderList();
    }
}

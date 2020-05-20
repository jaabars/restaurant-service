package kg.megacom.restaurantservice.controllers;

import kg.megacom.restaurantservice.model.dto.OrderHistoryDto;
import kg.megacom.restaurantservice.services.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orderStatus")
public class OrderStatusController {
    @Autowired
    private OrderStatusService orderStatusService;
    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public OrderHistoryDto saveOrderStatus(@RequestBody OrderHistoryDto orderHistoryDto){
        return orderStatusService.saveOrderStatus(orderHistoryDto);
    }
    @GetMapping("/get")
    public List<OrderHistoryDto> getOrderStatusList(){
        return orderStatusService.getOrderStatusList();
    }

}

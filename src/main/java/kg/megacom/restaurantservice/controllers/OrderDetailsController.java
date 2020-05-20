package kg.megacom.restaurantservice.controllers;

import kg.megacom.restaurantservice.model.dto.OrderDetailsDto;
import kg.megacom.restaurantservice.services.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("orderDetails")
public class OrderDetailsController {
    @Autowired
    private OrderDetailsService orderDetailsService;
    @GetMapping("/get")
    public List<OrderDetailsDto> getOrderDetailsList(){
        return orderDetailsService.getOrderDetailsList();
    }
}

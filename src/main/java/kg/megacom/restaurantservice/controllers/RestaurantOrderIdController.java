package kg.megacom.restaurantservice.controllers;

import kg.megacom.restaurantservice.model.dto.RestaurantOrdersDto;
import kg.megacom.restaurantservice.services.RestaurantOrderIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("restaurantOrders")
public class RestaurantOrderIdController {
    @Autowired
    private RestaurantOrderIdService restaurantOrderIdService;
    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public RestaurantOrdersDto saveRestaurantOrders(@RequestBody RestaurantOrdersDto restaurantOrdersDto){
        return restaurantOrderIdService.saveRestaurantOrderId(restaurantOrdersDto);
    }
    @GetMapping("/get")
    public List<RestaurantOrdersDto> getRestaurantOrders(){
        return restaurantOrderIdService.getRestaurantOrderIdList();
    }
}

package kg.megacom.restaurantservice.controllers;

import kg.megacom.restaurantservice.model.dto.RestaurantDto;
import kg.megacom.restaurantservice.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public RestaurantDto saveRestaurant(@RequestBody RestaurantDto restaurantDto){
        return restaurantService.saveRestaurant(restaurantDto);
    }
    @GetMapping("/get")
    public List<RestaurantDto> getRestaurants(){
        return restaurantService.getRestaurantList();
    }
    @PutMapping("/update")
    public RestaurantDto updateRestaurant(@RequestBody RestaurantDto restaurantDto){
    return restaurantService.saveRestaurant(restaurantDto);
    }
}

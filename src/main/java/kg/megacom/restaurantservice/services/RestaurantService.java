package kg.megacom.restaurantservice.services;

import kg.megacom.restaurantservice.model.dto.RestaurantDto;

import java.util.List;

public interface RestaurantService {
    RestaurantDto saveRestaurant(RestaurantDto restaurantDto);
    List<RestaurantDto> getRestaurantList();
}

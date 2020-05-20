package kg.megacom.restaurantservice.services;

import kg.megacom.restaurantservice.model.dto.RestaurantOrdersDto;

import java.util.List;

public interface RestaurantOrderIdService {
    RestaurantOrdersDto saveRestaurantOrderId(RestaurantOrdersDto restaurantOrdersDto);
    List<RestaurantOrdersDto> getRestaurantOrderIdList();
}

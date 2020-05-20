package kg.megacom.restaurantservice.services.impl;

import kg.megacom.restaurantservice.database.RestaurantRepository;
import kg.megacom.restaurantservice.mappers.RestaurantMapper;
import kg.megacom.restaurantservice.model.dto.RestaurantDto;
import kg.megacom.restaurantservice.model.entity.Restaurant;
import kg.megacom.restaurantservice.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;
    @Override
    public RestaurantDto saveRestaurant(RestaurantDto restaurantDto) {
        Restaurant restaurant = RestaurantMapper.INSTANCE.restaurantDtoToRestaurant(restaurantDto);
        restaurant = restaurantRepository.save(restaurant);
        restaurantDto = RestaurantMapper.INSTANCE.restaurantToRestaurantDto(restaurant);
        return restaurantDto;
    }

    @Override
    public List<RestaurantDto> getRestaurantList() {
        List<Restaurant> restaurantList = restaurantRepository.findAll();
        List<RestaurantDto> restaurantDtoList = RestaurantMapper.INSTANCE.restaurantListToRestaurantDtoList(restaurantList);

        return restaurantDtoList;
    }
}

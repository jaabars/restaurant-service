package kg.megacom.restaurantservice.mappers;

import kg.megacom.restaurantservice.model.dto.RestaurantDto;
import kg.megacom.restaurantservice.model.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RestaurantMapper {
    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);

    Restaurant restaurantDtoToRestaurant (RestaurantDto restaurantDto);
    RestaurantDto restaurantToRestaurantDto(Restaurant restaurant);

    List<Restaurant> restaurantDtoListToRestaurantList(List<RestaurantDto> restaurantDtoList);
    List<RestaurantDto> restaurantListToRestaurantDtoList(List<Restaurant> restaurantList);
}

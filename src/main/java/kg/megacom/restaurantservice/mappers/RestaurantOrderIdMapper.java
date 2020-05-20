package kg.megacom.restaurantservice.mappers;

import kg.megacom.restaurantservice.model.dto.RestaurantOrdersDto;
import kg.megacom.restaurantservice.model.entity.RestaurantOrders;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RestaurantOrderIdMapper {
    RestaurantOrderIdMapper INSTANCE= Mappers.getMapper(RestaurantOrderIdMapper.class);

    RestaurantOrders restaurantOrderIdDtoToRestaurantOrderId(RestaurantOrdersDto restaurantOrdersDto);
    RestaurantOrdersDto restaurantOrderIdToRestaurantOrderIdDto(RestaurantOrders restaurantOrders);

    List<RestaurantOrders> restaurantOrderIdDtoListToRestaurantOrIdList(List<RestaurantOrdersDto> restaurantOrdersDtoList);
    List<RestaurantOrdersDto> restaurantOrIdToResIdDtoList(List<RestaurantOrders> restaurantOrdersList);
}

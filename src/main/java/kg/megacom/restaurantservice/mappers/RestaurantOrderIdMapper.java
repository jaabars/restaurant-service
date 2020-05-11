package kg.megacom.restaurantservice.mappers;

import kg.megacom.restaurantservice.model.dto.RestaurantOrderIdDto;
import kg.megacom.restaurantservice.model.entity.RestaurantOrderId;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RestaurantOrderIdMapper {
    RestaurantOrderIdMapper INSTANCE= Mappers.getMapper(RestaurantOrderIdMapper.class);

    RestaurantOrderId restaurantOrderIdDtoToRestaurantOrderId(RestaurantOrderIdDto restaurantOrderIdDto);
    RestaurantOrderIdDto restaurantOrderIdToRestaurantOrderIdDto(RestaurantOrderId restaurantOrderId);

    List<RestaurantOrderId> restaurantOrderIdDtoListToRestaurantOrIdList(List<RestaurantOrderIdDto> restaurantOrderIdDtoList);
    List<RestaurantOrderIdDto> restaurantOrIdToResIdDtoList(List<RestaurantOrderId> restaurantOrderIdList);
}

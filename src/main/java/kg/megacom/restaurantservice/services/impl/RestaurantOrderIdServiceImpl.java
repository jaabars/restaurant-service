package kg.megacom.restaurantservice.services.impl;

import kg.megacom.restaurantservice.database.RestaurantOrderIdRepository;
import kg.megacom.restaurantservice.mappers.RestaurantOrderIdMapper;
import kg.megacom.restaurantservice.model.dto.RestaurantOrdersDto;
import kg.megacom.restaurantservice.model.entity.RestaurantOrders;
import kg.megacom.restaurantservice.services.RestaurantOrderIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestaurantOrderIdServiceImpl implements RestaurantOrderIdService {
    @Autowired
    private RestaurantOrderIdRepository restaurantOrderIdRepository;
    @Override
    public RestaurantOrdersDto saveRestaurantOrderId(RestaurantOrdersDto restaurantOrdersDto) {
        RestaurantOrders restaurantOrders = RestaurantOrderIdMapper.INSTANCE.restaurantOrderIdDtoToRestaurantOrderId(restaurantOrdersDto);
        restaurantOrders = restaurantOrderIdRepository.save(restaurantOrders);
        restaurantOrdersDto = RestaurantOrderIdMapper.INSTANCE.restaurantOrderIdToRestaurantOrderIdDto(restaurantOrders);
        return restaurantOrdersDto;
    }

    @Override
    public List<RestaurantOrdersDto> getRestaurantOrderIdList() {
        List<RestaurantOrders> restaurantOrdersList = restaurantOrderIdRepository.findAll();
        List<RestaurantOrdersDto> restaurantOrdersDtoList = RestaurantOrderIdMapper.INSTANCE.restaurantOrIdToResIdDtoList(restaurantOrdersList);
        return restaurantOrdersDtoList;
    }
}

package kg.megacom.restaurantservice.mappers;

import kg.megacom.restaurantservice.model.dto.OrderStatusDto;
import kg.megacom.restaurantservice.model.entity.OrderStatus;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderStatusMapper {
    OrderStatusMapper INSTANCE = Mappers.getMapper(OrderStatusMapper.class);

    OrderStatus orderStatusDtoToOrderStatus(OrderStatusDto orderStatusDto);
    OrderStatusDto orderStatusToOrderStatusDto(OrderStatus orderStatus);
    List<OrderStatus> orderStatusDtoListToOrderStatusList(List<OrderStatusDto> orderStatusDtoList);
    List<OrderStatusDto> orderStatusListToOrderStatusDtoList(List<OrderStatus> orderStatusList);
}

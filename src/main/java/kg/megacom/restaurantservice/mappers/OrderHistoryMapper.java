package kg.megacom.restaurantservice.mappers;

import kg.megacom.restaurantservice.model.dto.OrderHistoryDto;
import kg.megacom.restaurantservice.model.entity.OrderHistory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderHistoryMapper {
    OrderHistoryMapper INSTANCE = Mappers.getMapper(OrderHistoryMapper.class);

    OrderHistory orderStatusDtoToOrderStatus(OrderHistoryDto orderHistoryDto);
    OrderHistoryDto orderStatusToOrderStatusDto(OrderHistory orderHistory);
    List<OrderHistory> orderStatusDtoListToOrderStatusList(List<OrderHistoryDto> orderHistoryDtoList);
    List<OrderHistoryDto> orderStatusListToOrderStatusDtoList(List<OrderHistory> orderHistoryList);
}

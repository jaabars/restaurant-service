package kg.megacom.restaurantservice.mappers;

import kg.megacom.restaurantservice.model.dto.OrderDetailsDto;
import kg.megacom.restaurantservice.model.entity.OrderDetails;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderDetailsMapper {
    OrderDetailsMapper INSTANCE = Mappers.getMapper(OrderDetailsMapper.class);

    OrderDetails orderDetailsDtoToOrderDetails(OrderDetailsDto orderDetailsDto);
    OrderDetailsDto orderDetailsToOrderDetailsDto(OrderDetails orderDetails);
    List<OrderDetails> orderDetailsDtoListToOrderDetailsList(List<OrderDetailsDto> orderDetailsDtoList);
    List<OrderDetailsDto> orderDetailsListToOrderDetailsDto(List<OrderDetails> orderDetailsList);

}

package kg.megacom.restaurantservice.model.dto;




import kg.megacom.restaurantservice.enums.OrderStatus;
import lombok.Data;

import java.util.Date;
@Data
public class OrderHistoryDto {
    private Long id;
    private Date startDate;
    private Date endDate;

    private OrderDto order;

    private OrderStatus orderStatus;
}

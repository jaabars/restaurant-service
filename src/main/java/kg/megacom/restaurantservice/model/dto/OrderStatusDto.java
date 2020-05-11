package kg.megacom.restaurantservice.model.dto;




import lombok.Data;

import java.util.Date;
@Data
public class OrderStatusDto {
    private Long id;
    private Date startDate;
    private Date endDate;

    private OrderDto order;

    private StatusDto status;
}

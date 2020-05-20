package kg.megacom.restaurantservice.model.dto;



import lombok.Data;


import java.util.Date;
@Data
public class RestaurantOrdersDto {
    private Long id;

    private RestaurantDto restaurant;

    private OrderDto order;
    private boolean isReady;
    private Date startDate;
    private Date endDate;
}

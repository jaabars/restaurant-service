package kg.megacom.restaurantservice.model.dto;

import kg.megacom.restaurantservice.model.entity.Order;

import lombok.Data;


import java.util.Date;
@Data
public class RestaurantOrderIdDto {
    private Long id;

    private RestaurantDto restaurant;

    private Order order;
    private boolean isReady;
    private Date startDate;
    private Date endDate;
}

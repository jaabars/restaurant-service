package kg.megacom.restaurantservice.model.dto;

import lombok.Data;

@Data
public class CustomerDto {
    private Long id;
    private String name;
    private String address;
    private String houseNo;
    private int flatNo;
    private String phone;
}

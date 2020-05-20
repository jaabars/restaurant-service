package kg.megacom.restaurantservice.model.dto;


import lombok.Data;

import java.util.List;


@Data
public class UserDto {
    private Long id;
    private String name;
    private boolean active;

    private PositionDto position;
    private List<PhoneDto> phones;
}

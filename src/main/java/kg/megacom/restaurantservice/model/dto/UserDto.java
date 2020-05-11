package kg.megacom.restaurantservice.model.dto;


import lombok.Data;



@Data
public class UserDto {
    private Long id;
    private String name;
    private boolean active;

    private PositionDto position;
}

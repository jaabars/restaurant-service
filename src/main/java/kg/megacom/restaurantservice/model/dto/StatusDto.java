package kg.megacom.restaurantservice.model.dto;

import lombok.Data;

@Data
public class StatusDto {
    private Long id;
    private String name;
    private boolean active;
}

package kg.megacom.restaurantservice.model.dto;
import kg.megacom.restaurantservice.model.entity.Menu;
import lombok.Data;


@Data
public class DishDto {
    private Long id;
    private String name;
    private double size;
    private String imgPath;
    private boolean active;

    private MenuDto menu;
}

package kg.megacom.restaurantservice.model.dto;

import kg.megacom.restaurantservice.model.entity.User;
import lombok.Data;


@Data
public class AccountDto {
    private Long id;
    private String login;
    private String password;

    private UserDto user;
}

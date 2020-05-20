package kg.megacom.restaurantservice.model.dto;

import lombok.Data;


@Data
public class AccountDto {
    private Long id;

    private String login;
    private String password;

    private UserDto user;
}

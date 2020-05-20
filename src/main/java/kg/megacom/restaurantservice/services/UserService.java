package kg.megacom.restaurantservice.services;

import kg.megacom.restaurantservice.model.dto.UserDto;

import java.util.List;

public interface UserService{
    UserDto saveUser(UserDto userDto);
    List<UserDto> getUserList();

}

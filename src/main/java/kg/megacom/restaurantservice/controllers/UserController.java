package kg.megacom.restaurantservice.controllers;

import kg.megacom.restaurantservice.model.dto.UserDto;
import kg.megacom.restaurantservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public UserDto saveUser(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
    }
    @GetMapping("/get")
    public List<UserDto> getUsers(){
        return userService.getUserList();
    }
}

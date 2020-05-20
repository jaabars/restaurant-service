package kg.megacom.restaurantservice.services.impl;

import kg.megacom.restaurantservice.database.UserRepository;
import kg.megacom.restaurantservice.mappers.UserMapper;
import kg.megacom.restaurantservice.model.dto.UserDto;
import kg.megacom.restaurantservice.model.entity.User;
import kg.megacom.restaurantservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDto saveUser(UserDto userDto) {
        User user = UserMapper.INSTANCE.userDtoToUser(userDto);
        user = userRepository.save(user);
        userDto = UserMapper.INSTANCE.userToUserDto(user);
        return userDto;
    }

    @Override
    public List<UserDto> getUserList() {
        List<User> userList = userRepository.findAll();
        List<UserDto> userDtoList = UserMapper.INSTANCE.userListToUserDtoList(userList);
        return userDtoList;
    }
}

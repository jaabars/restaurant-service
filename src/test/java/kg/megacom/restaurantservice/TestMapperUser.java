package kg.megacom.restaurantservice;

import kg.megacom.restaurantservice.mappers.UserMapper;
import kg.megacom.restaurantservice.model.dto.PositionDto;
import kg.megacom.restaurantservice.model.dto.UserDto;
import kg.megacom.restaurantservice.model.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestMapperUser {
    @Test
    public  void userTest(){
        UserDto userDto = new UserDto();
        userDto.setActive(true);
        userDto.setName("Mark");
        PositionDto positionDto = new PositionDto();
        positionDto.setName("Manager");
        positionDto.setActive(true);
        userDto.setPosition(positionDto);
        User user = UserMapper.INSTANCE.userDtoToUser(userDto);
        UserDto found = UserMapper.INSTANCE.userToUserDto(user);
        assertEquals(found.getName(),userDto.getName());
        assertEquals(found.isActive(),userDto.isActive());
        assertEquals(found.getPosition().getName(),userDto.getPosition().getName());
        assertEquals(found.getPosition(),userDto.getPosition());
    }
}

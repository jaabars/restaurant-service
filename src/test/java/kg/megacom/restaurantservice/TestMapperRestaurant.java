package kg.megacom.restaurantservice;

import kg.megacom.restaurantservice.mappers.RestaurantMapper;
import kg.megacom.restaurantservice.model.dto.RestaurantDto;
import kg.megacom.restaurantservice.model.entity.Restaurant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestMapperRestaurant {
    @Test
    public void restaurantTest(){
        RestaurantDto restaurantDto=new RestaurantDto();
        restaurantDto.setActive(true);
        restaurantDto.setName("Monaco");
        Restaurant restaurant = RestaurantMapper.INSTANCE.restaurantDtoToRestaurant(restaurantDto);
        RestaurantDto found = RestaurantMapper.INSTANCE.restaurantToRestaurantDto(restaurant);
        assertEquals(found.getName(),restaurantDto.getName());
        assertEquals(found.isActive(),restaurantDto.isActive());

    }
}

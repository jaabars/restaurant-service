package kg.megacom.restaurantservice;

import kg.megacom.restaurantservice.mappers.DishMapper;
import kg.megacom.restaurantservice.model.dto.DishDto;
import kg.megacom.restaurantservice.model.entity.Dish;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestMapperDish {
    @Test
    public void dishTest(){
        DishDto dishDto=new DishDto();
        dishDto.setActive(true);
        dishDto.setImgPath("D://img/dish/id/img");
        dishDto.setName("Besh Barmak");
        dishDto.setSize(500);
        Dish dish= DishMapper.INSTANCE.dishDtoToDish(dishDto);
        DishDto found=DishMapper.INSTANCE.dishToDishDto(dish);
        assertEquals(found.isActive(),dishDto.isActive());
        assertEquals(found.getImgPath(),dishDto.getImgPath());
        assertEquals(found.getName(),dishDto.getName());
        assertEquals(found.getSize(),dishDto.getSize(),0.01);
    }
}

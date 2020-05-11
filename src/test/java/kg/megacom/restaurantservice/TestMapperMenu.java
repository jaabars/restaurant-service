package kg.megacom.restaurantservice;

import kg.megacom.restaurantservice.mappers.MenuMapper;
import kg.megacom.restaurantservice.model.dto.MenuDto;
import kg.megacom.restaurantservice.model.entity.Menu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestMapperMenu {
    @Test
    public void menuTest(){
        MenuDto menuDto =new MenuDto();
        menuDto.setId(1l);
        Menu menu= MenuMapper.INSTANCE.menuDtoToMenu(menuDto);
        MenuDto found=MenuMapper.INSTANCE.menuToMenuDto(menu);
        assertEquals(found.getId(),menuDto.getId());
    }
}

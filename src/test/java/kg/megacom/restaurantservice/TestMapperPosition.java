package kg.megacom.restaurantservice;

import kg.megacom.restaurantservice.mappers.PositionMapper;
import kg.megacom.restaurantservice.model.dto.PositionDto;
import kg.megacom.restaurantservice.model.entity.Position;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestMapperPosition {
    @Test
    public void positionTest(){
        PositionDto positionDto=new PositionDto();
        positionDto.setActive(true);
        positionDto.setName("Carrier");
        Position position= PositionMapper.INSTANCE.positionDtoToPosition(positionDto);
        PositionDto found=PositionMapper.INSTANCE.positionToPositionDto(position);
        assertEquals(found.getName(),positionDto.getName());
        assertEquals(found.isActive(),positionDto.isActive());

    }
}

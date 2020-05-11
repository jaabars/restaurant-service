package kg.megacom.restaurantservice;

import kg.megacom.restaurantservice.mappers.StatusMapper;
import kg.megacom.restaurantservice.model.dto.StatusDto;
import kg.megacom.restaurantservice.model.entity.Status;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestMapperStatus {
    @Test
    public void  statusTest(){
        StatusDto statusDto = new StatusDto();
        statusDto.setActive(false);
        statusDto.setName("Ready");
        Status status = StatusMapper.INSTANCE.statusDtoToStatus(statusDto);
        StatusDto found = StatusMapper.INSTANCE.statusToStatus(status);
        assertEquals(found.getName(),statusDto.getName());
        assertEquals(found.isActive(),statusDto.isActive());
    }
}

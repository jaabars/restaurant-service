package kg.megacom.restaurantservice;

import kg.megacom.restaurantservice.mappers.PhoneMapper;
import kg.megacom.restaurantservice.model.dto.PhoneDto;
import kg.megacom.restaurantservice.model.entity.Phone;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestMapperPhone {
    @Test
    public void phoneTest(){
        PhoneDto phoneDto=new PhoneDto();
        phoneDto.setActive(true);
        phoneDto.setMain(false);
        phoneDto.setPhone("+996 556 556 556");
        Phone phone= PhoneMapper.INSTANCE.phoneDtoToPhone(phoneDto);
        PhoneDto found=PhoneMapper.INSTANCE.phoneToPhoneDto(phone);
        assertEquals(found.getPhone(),phoneDto.getPhone());
        assertEquals(found.isActive(),phoneDto.isActive());
        assertEquals(found.isMain(),phoneDto.isMain());
    }
}

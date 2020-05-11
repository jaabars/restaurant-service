package kg.megacom.restaurantservice;

import kg.megacom.restaurantservice.mappers.PriceMapper;
import kg.megacom.restaurantservice.model.dto.PriceDto;
import kg.megacom.restaurantservice.model.entity.Price;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestMapperPrice {
    @Test
    public void priceTest(){
        PriceDto priceDto=new PriceDto();
        priceDto.setEndDate(new Date());
        priceDto.setStartDate(new Date());
        priceDto.setPrice(320);
        Price price= PriceMapper.INSTANCE.priceDtoToPrice(priceDto);
        PriceDto found=PriceMapper.INSTANCE.priceToPriceDto(price);
        assertEquals(found.getPrice(),priceDto.getPrice(),0.1);
        assertEquals(found.getEndDate(),priceDto.getEndDate());
        assertEquals(found.getStartDate(),priceDto.getStartDate());
    }
}

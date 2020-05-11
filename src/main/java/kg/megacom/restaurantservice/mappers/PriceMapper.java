package kg.megacom.restaurantservice.mappers;

import kg.megacom.restaurantservice.model.dto.PriceDto;
import kg.megacom.restaurantservice.model.entity.Price;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PriceMapper {
    PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);

    Price priceDtoToPrice(PriceDto priceDto);
    PriceDto priceToPriceDto(Price price);
    List<Price> priceDtoListToPriceDtoList(List<PriceDto> priceDtoList);
    List<PriceDto> priceListToPriceDtoList(List<Price> priceList);
}

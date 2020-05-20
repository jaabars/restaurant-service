package kg.megacom.restaurantservice.services.impl;

import kg.megacom.restaurantservice.database.PriceRepository;
import kg.megacom.restaurantservice.mappers.PriceMapper;
import kg.megacom.restaurantservice.model.dto.PriceDto;
import kg.megacom.restaurantservice.model.entity.Price;
import kg.megacom.restaurantservice.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PriceServiceImpl implements PriceService {
    @Autowired
    private PriceRepository priceRepository;
    @Override
    public PriceDto savePrice(PriceDto priceDto) {
        Price price = PriceMapper.INSTANCE.priceDtoToPrice(priceDto);
        price = priceRepository.save(price);
        priceDto = PriceMapper.INSTANCE.priceToPriceDto(price);
        return priceDto;
    }

    @Override
    public List<PriceDto> getPriceList() {
        List<Price> priceList = priceRepository.findAll();
        List<PriceDto> priceDtoList = PriceMapper.INSTANCE.priceListToPriceDtoList(priceList);
        return priceDtoList;
    }

    @Override
    public Double getPriceByDishId(Long id) {
         Price price = priceRepository.findByDishId(id);
         Double d = price.getPrice();
         return  d;
    }
}

package kg.megacom.restaurantservice.services;

import kg.megacom.restaurantservice.model.dto.PriceDto;

import java.util.List;

public interface PriceService {
    PriceDto savePrice(PriceDto priceDto);
    List<PriceDto> getPriceList();
    Double getPriceByDishId(Long id);
}

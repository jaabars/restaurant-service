package kg.megacom.restaurantservice.services;

import kg.megacom.restaurantservice.model.dto.PhoneDto;

import java.util.List;

public interface PhoneService {
    PhoneDto savePhone(PhoneDto phoneDto);
    List<PhoneDto> getPhoneList();
}

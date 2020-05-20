package kg.megacom.restaurantservice.services.impl;

import kg.megacom.restaurantservice.database.PhoneRepository;
import kg.megacom.restaurantservice.mappers.PhoneMapper;
import kg.megacom.restaurantservice.model.dto.PhoneDto;
import kg.megacom.restaurantservice.model.entity.Phone;
import kg.megacom.restaurantservice.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhoneServiceImpl implements PhoneService {
    @Autowired
    private PhoneRepository phoneRepository;
    @Override
    public PhoneDto savePhone(PhoneDto phoneDto) {
        Phone phone = PhoneMapper.INSTANCE.phoneDtoToPhone(phoneDto);
        phone = phoneRepository.save(phone);
        phoneDto = PhoneMapper.INSTANCE.phoneToPhoneDto(phone);
        return phoneDto;
    }

    @Override
    public List<PhoneDto> getPhoneList() {
        List<Phone> phoneList = phoneRepository.findAll();
        List<PhoneDto> phoneDtoList = PhoneMapper.INSTANCE.phoneListToPhoneDtoList(phoneList);
        return phoneDtoList;
    }
}

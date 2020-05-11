package kg.megacom.restaurantservice.mappers;

import kg.megacom.restaurantservice.model.dto.PhoneDto;
import kg.megacom.restaurantservice.model.entity.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PhoneMapper {
    PhoneMapper INSTANCE= Mappers.getMapper(PhoneMapper.class);

    Phone phoneDtoToPhone(PhoneDto phoneDto);
    PhoneDto phoneToPhoneDto(Phone phone);
    List<Phone>phoneDtoListToPhoneList(List<PhoneDto> phoneDtoList);
    List<PhoneDto>phoneListToPhoneDtoList(List<Phone> phoneList);
}

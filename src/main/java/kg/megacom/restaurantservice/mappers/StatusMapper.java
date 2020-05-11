package kg.megacom.restaurantservice.mappers;

import kg.megacom.restaurantservice.model.dto.StatusDto;
import kg.megacom.restaurantservice.model.entity.Status;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StatusMapper {
    StatusMapper INSTANCE= Mappers.getMapper(StatusMapper.class);

    Status statusDtoToStatus(StatusDto statusDto);
    StatusDto statusToStatus(Status status);

    List<Status> statusDtoListToStatusList(List<StatusDto> statusDtoList);
    List<StatusDto> statusListToStatusDtoList(List<Status>statusList);
}

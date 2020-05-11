package kg.megacom.restaurantservice.mappers;

import kg.megacom.restaurantservice.model.dto.PositionDto;
import kg.megacom.restaurantservice.model.entity.Position;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PositionMapper {
    PositionMapper INSTANCE= Mappers.getMapper(PositionMapper.class);

    Position positionDtoToPosition(PositionDto positionDto);
    PositionDto positionToPositionDto(Position position);
    List<Position> positionDtoListToPositionList(List<PositionDto> positionDtoList);
    List<PositionDto> positionListToPositionDtoList(List<Position> positionList);
}

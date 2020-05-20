package kg.megacom.restaurantservice.services;

import kg.megacom.restaurantservice.model.dto.PositionDto;

import java.util.List;

public interface PositionService {
    PositionDto savePosition(PositionDto positionDto);
    List<PositionDto> getPositionList();
}

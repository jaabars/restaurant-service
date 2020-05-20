package kg.megacom.restaurantservice.services.impl;

import kg.megacom.restaurantservice.database.PositionRepository;
import kg.megacom.restaurantservice.mappers.PositionMapper;
import kg.megacom.restaurantservice.model.dto.PositionDto;
import kg.megacom.restaurantservice.model.entity.Position;
import kg.megacom.restaurantservice.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionRepository positionRepository;
    @Override
    public PositionDto savePosition(PositionDto positionDto) {
        Position position = PositionMapper.INSTANCE.positionDtoToPosition(positionDto);
        position = positionRepository.save(position);
        positionDto = PositionMapper.INSTANCE.positionToPositionDto(position);
        return positionDto;
    }

    @Override
    public List<PositionDto> getPositionList() {
        List<Position> positionList = positionRepository.findAll();
        List<PositionDto> positionDtoList = PositionMapper.INSTANCE.positionListToPositionDtoList(positionList);
        return positionDtoList;
    }
}

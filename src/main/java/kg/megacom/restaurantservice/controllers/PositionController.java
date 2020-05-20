package kg.megacom.restaurantservice.controllers;

import kg.megacom.restaurantservice.model.dto.PositionDto;
import kg.megacom.restaurantservice.services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/position")
public class PositionController {
    @Autowired
    private PositionService positionService;

    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public PositionDto savePosition(@RequestBody PositionDto positionDto){
        return positionService.savePosition(positionDto);
    }
    @GetMapping("/get")
    public List<PositionDto> getPositions(){
        return positionService.getPositionList();
    }
}

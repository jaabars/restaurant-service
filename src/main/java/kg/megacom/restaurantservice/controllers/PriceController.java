package kg.megacom.restaurantservice.controllers;

import kg.megacom.restaurantservice.model.dto.PriceDto;
import kg.megacom.restaurantservice.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("price")
public class PriceController {
    @Autowired
    private PriceService priceService;

    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public PriceDto savePrice(@RequestBody PriceDto priceDto){
        return priceService.savePrice(priceDto);
    }
    @GetMapping("/get")
    public List<PriceDto> getPrices(){
        return priceService.getPriceList();
    }
    @GetMapping("/getPriceByDishId")
    public  Double getPrice(@RequestParam Long id){
        return priceService.getPriceByDishId(id);
    }
    @PutMapping("/update")
    public PriceDto updatePrice(@RequestBody PriceDto priceDto){
        return  priceService.savePrice(priceDto);
    }
}

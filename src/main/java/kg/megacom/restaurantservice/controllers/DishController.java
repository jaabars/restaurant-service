package kg.megacom.restaurantservice.controllers;

import kg.megacom.restaurantservice.model.dto.DishDto;
import kg.megacom.restaurantservice.services.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dish")
public class DishController  {
    @Autowired
    private DishService dishService;
    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public DishDto saveDish(@RequestBody DishDto dishDto){
        return dishService.saveDish(dishDto);
    }
    @GetMapping("/get")
    public List<DishDto> getDishes(){
        return dishService.getDishList();
    }
    @PutMapping("/update")
    public DishDto updateDish(@RequestBody DishDto dishDto){
        return dishService.saveDish(dishDto);
    }
    @GetMapping("/getByMenuId")
    public List<DishDto> getDishesByMenuId(@RequestParam Long id){
        return dishService.getDishListByMenuId(id);
    }
    @GetMapping("/getDishById")
    public DishDto getDishById(@RequestParam Long id){
        return  dishService.getDishById(id);
    }

}

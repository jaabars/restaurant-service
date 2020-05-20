package kg.megacom.restaurantservice.controllers;

import kg.megacom.restaurantservice.model.dto.MenuDto;
import kg.megacom.restaurantservice.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;
    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public MenuDto saveMenu(@RequestBody MenuDto menuDto){
        return menuService.saveMenu(menuDto);
    }
    @GetMapping("/get")
    public List<MenuDto> getMenus(){
        return menuService.getMenuList();
    }
    @PutMapping("/update")
    public MenuDto updateMenu(@RequestBody MenuDto menuDto){
        return menuService.saveMenu(menuDto);
    }

}

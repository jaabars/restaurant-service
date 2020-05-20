package kg.megacom.restaurantservice.services.impl;

import kg.megacom.restaurantservice.database.MenuRepository;
import kg.megacom.restaurantservice.mappers.MenuMapper;
import kg.megacom.restaurantservice.model.dto.MenuDto;
import kg.megacom.restaurantservice.model.entity.Menu;
import kg.megacom.restaurantservice.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuRepository menuRepository;
    @Override
    public MenuDto saveMenu(MenuDto menuDto) {
        Menu menu = MenuMapper.INSTANCE.menuDtoToMenu(menuDto);
        menu = menuRepository.save(menu);
        menuDto = MenuMapper.INSTANCE.menuToMenuDto(menu);
        return menuDto;
    }

    @Override
    public List<MenuDto> getMenuList() {
        List<Menu> menuList = menuRepository.findAll();
        List<MenuDto> menuDtoList = MenuMapper.INSTANCE.menuListToMenuDtoList(menuList);
        return menuDtoList;
    }
}

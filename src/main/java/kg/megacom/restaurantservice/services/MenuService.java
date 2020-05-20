package kg.megacom.restaurantservice.services;

import kg.megacom.restaurantservice.model.dto.MenuDto;

import java.util.List;

public interface MenuService {
    MenuDto saveMenu(MenuDto menuDto);
    List<MenuDto> getMenuList ();
}

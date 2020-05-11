package kg.megacom.restaurantservice.mappers;

import kg.megacom.restaurantservice.model.dto.MenuDto;
import kg.megacom.restaurantservice.model.entity.Menu;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MenuMapper {
    MenuMapper INSTANCE = Mappers.getMapper(MenuMapper.class);

    Menu menuDtoToMenu(MenuDto menuDto);
    MenuDto menuToMenuDto(Menu menu);
    List<Menu> menuDtoListToMenuList(List<MenuDto> menuDtoList);
    List<MenuDto> menuListToMenuDtoList(List<Menu> menuList);
}

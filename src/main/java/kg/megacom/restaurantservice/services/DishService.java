package kg.megacom.restaurantservice.services;

import kg.megacom.restaurantservice.model.dto.DishDto;

import java.util.List;

public interface DishService {
    DishDto saveDish(DishDto dishDto);
    List<DishDto> getDishList();
    List<DishDto> getDishListByMenuId(Long id);
    DishDto getDishById(Long id);
}

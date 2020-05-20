package kg.megacom.restaurantservice.services.impl;

import kg.megacom.restaurantservice.database.DishRepository;
import kg.megacom.restaurantservice.mappers.DishMapper;
import kg.megacom.restaurantservice.model.dto.DishDto;
import kg.megacom.restaurantservice.model.entity.Dish;
import kg.megacom.restaurantservice.services.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.Collections;
import java.util.List;
@Service
public class DishServiceImpl implements DishService {
    @Autowired
    private DishRepository dishRepository;
    @Override
    public DishDto saveDish(DishDto dishDto) {
        Dish dish = DishMapper.INSTANCE.dishDtoToDish(dishDto);
        dish = dishRepository.save(dish);
        dishDto = DishMapper.INSTANCE.dishToDishDto(dish);
        return dishDto;
    }

    @Override
    public List<DishDto> getDishList() {
        List<Dish> dishList = dishRepository.findAll();
        List<DishDto> dishDtoList = DishMapper.INSTANCE.dishListToDishDtoList(dishList);
        return dishDtoList;
    }

    @Override
    public List<DishDto> getDishListByMenuId(Long id) {
        List<Dish> dishList = dishRepository.findAllByMenuId(id);
        List<DishDto> dishDtoList = DishMapper.INSTANCE.dishListToDishDtoList(dishList);
        return dishDtoList;
    }

    @Override
    public DishDto getDishById(Long id) {
        Dish dish = dishRepository.findById(id).orElse(null);
        DishDto dishDto = DishMapper.INSTANCE.dishToDishDto(dish);
        return dishDto;
    }
}

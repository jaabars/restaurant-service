package kg.megacom.restaurantservice.mappers;

import kg.megacom.restaurantservice.model.dto.DishDto;
import kg.megacom.restaurantservice.model.entity.Dish;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DishMapper {
    DishMapper INSTANCE = Mappers.getMapper(DishMapper.class);

    Dish dishDtoToDish(DishDto dishDto);
    DishDto dishToDishDto(Dish dish);
    List<Dish> dishDtoListToDishList(List<DishDto> dishDtoList);
    List<DishDto> dishListToDishDtoList(List<Dish> dishList);
}

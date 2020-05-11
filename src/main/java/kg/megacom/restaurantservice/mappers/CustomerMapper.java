package kg.megacom.restaurantservice.mappers;

import kg.megacom.restaurantservice.model.dto.CustomerDto;
import kg.megacom.restaurantservice.model.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    Customer customerDtoToCustomer(CustomerDto customerDto);
    CustomerDto customerToCustomerDto(Customer customer);
    List<Customer> customerDtoListToCustomerList(List<CustomerDto> customerDtoList);
    List<CustomerDto> customerListToCustomerDtoList(List<Customer> customerList);
}

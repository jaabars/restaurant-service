package kg.megacom.restaurantservice;

import kg.megacom.restaurantservice.mappers.CustomerMapper;
import kg.megacom.restaurantservice.model.dto.CustomerDto;
import kg.megacom.restaurantservice.model.entity.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestMapperCustomer {
    @Test
    public void customerTest(){
        CustomerDto customerDto=new CustomerDto();
        customerDto.setName("Aibek");
        customerDto.setAddress("Bishkek");
        customerDto.setFlatNo(12);
        customerDto.setHouseNo("12/1B");
        Customer customer= CustomerMapper.INSTANCE.customerDtoToCustomer(customerDto);
        CustomerDto found=CustomerMapper.INSTANCE.customerToCustomerDto(customer);
        assertEquals(found.getName(),customerDto.getName());
        assertEquals(found.getAddress(),customerDto.getAddress());
        assertEquals(found.getFlatNo(),customerDto.getFlatNo());
        assertEquals(found.getHouseNo(),customerDto.getHouseNo());
    }
}

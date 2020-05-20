package kg.megacom.restaurantservice.services.impl;

import kg.megacom.restaurantservice.database.CustomerRepository;
import kg.megacom.restaurantservice.mappers.CustomerMapper;
import kg.megacom.restaurantservice.model.dto.CustomerDto;
import kg.megacom.restaurantservice.model.entity.Customer;
import kg.megacom.restaurantservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        Customer customer = CustomerMapper.INSTANCE.customerDtoToCustomer(customerDto);
        customer = customerRepository.save(customer);
        customerDto = CustomerMapper.INSTANCE.customerToCustomerDto(customer);
        return customerDto;
    }

    @Override
    public List<CustomerDto> getCustomerList() {
        List<Customer> customerList = customerRepository.findAll();
        List<CustomerDto> customerDtoList = CustomerMapper.INSTANCE.customerListToCustomerDtoList(customerList);
        return customerDtoList;
    }

    @Override
    public int getCustomerByPhoneAndPass(String phone, String pass) {
        System.out.println(phone);
        System.out.println(pass);
         int n = customerRepository.countByPhoneAndPassword(phone,pass);
        System.out.println(n);
     return n;
    }
}

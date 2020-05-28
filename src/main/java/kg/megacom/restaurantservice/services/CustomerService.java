package kg.megacom.restaurantservice.services;

import kg.megacom.restaurantservice.model.dto.CustomerDto;


import java.util.List;

public interface CustomerService {
    CustomerDto saveCustomer (CustomerDto customerDto);
    List<CustomerDto> getCustomerList();
    String getCustomerByPhoneAndPass(String phone, String pass);
}

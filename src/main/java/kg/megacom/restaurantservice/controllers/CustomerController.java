package kg.megacom.restaurantservice.controllers;

import kg.megacom.restaurantservice.model.dto.CustomerDto;
import kg.megacom.restaurantservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDto saveCustomer(@RequestBody CustomerDto customerDto){
        return customerService.saveCustomer(customerDto);
    }
    @GetMapping("/get")
    public List<CustomerDto> getCustomers(){
        return customerService.getCustomerList();
    }
    @GetMapping(path = "/getByPhone")
    public int getCustomerByPhone(@RequestParam String phone, @RequestParam String password){

       int n =customerService.getCustomerByPhoneAndPass(phone,password);
        System.out.println(n);
        return n;
    }
}

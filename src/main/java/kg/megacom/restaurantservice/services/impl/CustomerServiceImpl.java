package kg.megacom.restaurantservice.services.impl;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import kg.megacom.restaurantservice.database.CustomerRepository;
import kg.megacom.restaurantservice.database.UserSessionRepository;
import kg.megacom.restaurantservice.exceptions.UserNotFoundException;
import kg.megacom.restaurantservice.mappers.CustomerMapper;
import kg.megacom.restaurantservice.model.dto.CustomerDto;
import kg.megacom.restaurantservice.model.entity.Customer;
import kg.megacom.restaurantservice.model.entity.UserSession;
import kg.megacom.restaurantservice.services.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private UserSessionRepository userSessionRepository;
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
    public  String getCustomerByPhoneAndPass(String phone, String pass) {
        System.out.println(phone);
        System.out.println(pass);
        Customer customer = customerRepository.findByPhoneAndPassword(phone,pass);
        if (!customer.equals(null)) {
            String sessionId = UUID.randomUUID().toString();
            UserSession userSession = new UserSession();
            userSession.setSessionID(sessionId);
            userSession.setCustomer(customer);
            userSession.setStartDate(new Date());
            Date endDate = userSession.getStartDate();
            endDate = Date.from(endDate.toInstant().plusSeconds(300));
            userSession.setEndDate(endDate);
            JwtBuilder jwtBuilder = Jwts.builder().setPayload(userSession.getSessionID());
            String jwt = jwtBuilder.signWith(SignatureAlgorithm.HS256,sessionId).compact();
            System.out.println(jwt);
            userSession.setToken(jwt);
            userSessionRepository.save(userSession);
            return jwt;
        }else if(customer.equals(null)) {
            throw new UserNotFoundException("Такой пользователь не существует ");
        }else
        {
            return null;
        }
    }
}

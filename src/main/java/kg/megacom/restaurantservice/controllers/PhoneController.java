package kg.megacom.restaurantservice.controllers;

import kg.megacom.restaurantservice.model.dto.PhoneDto;
import kg.megacom.restaurantservice.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phone")
public class PhoneController {
    @Autowired
    private PhoneService phoneService;
    @PostMapping("save")
    public PhoneDto savePhone(@RequestBody PhoneDto phoneDto){
        return phoneService.savePhone(phoneDto);
    }
    @GetMapping("/get")
    public List<PhoneDto> getPhones(){
        return phoneService.getPhoneList();
    }
}

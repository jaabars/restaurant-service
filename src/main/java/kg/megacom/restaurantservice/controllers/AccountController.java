package kg.megacom.restaurantservice.controllers;

import kg.megacom.restaurantservice.model.dto.AccountDto;
import kg.megacom.restaurantservice.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public AccountDto saveAccount(@RequestBody AccountDto accountDto){
        return accountService.saveAccount(accountDto);
    }
    @GetMapping("/get")
    public List<AccountDto> getAccounts() {
        return accountService.getAccountList();
    }

}

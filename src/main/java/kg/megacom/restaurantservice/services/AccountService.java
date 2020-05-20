package kg.megacom.restaurantservice.services;

import kg.megacom.restaurantservice.model.dto.AccountDto;

import java.util.List;


public interface AccountService {
    AccountDto saveAccount(AccountDto accountDto);
    List<AccountDto> getAccountList();
}

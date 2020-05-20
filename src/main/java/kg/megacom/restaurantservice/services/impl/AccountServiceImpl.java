package kg.megacom.restaurantservice.services.impl;

import kg.megacom.restaurantservice.database.AccountRepository;
import kg.megacom.restaurantservice.mappers.AccountMapper;
import kg.megacom.restaurantservice.model.dto.AccountDto;
import kg.megacom.restaurantservice.model.entity.Account;
import kg.megacom.restaurantservice.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Override
    public AccountDto saveAccount(AccountDto accountDto) {
        Account account= AccountMapper.INSTANCE.accountDtoToAccount(accountDto);
        account=accountRepository.save(account);
        accountDto=AccountMapper.INSTANCE.accountToAccountDto(account);
        return accountDto;
    }

    @Override
    public List<AccountDto> getAccountList() {
        List<Account> accountList = accountRepository.findAll();
        List<AccountDto> accountDtoList = AccountMapper.INSTANCE.accountListToAccountDtoList(accountList);
        return accountDtoList;
    }
}

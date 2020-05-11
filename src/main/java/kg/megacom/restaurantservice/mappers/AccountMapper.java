package kg.megacom.restaurantservice.mappers;

import kg.megacom.restaurantservice.model.dto.AccountDto;
import kg.megacom.restaurantservice.model.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AccountMapper {
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    Account accountDtoToAccount(AccountDto accountDto);
    AccountDto accountToAccountDto(Account account);
    List<Account> accountDtoListToAccountList(List<AccountDto> accountDtoList);
    List<AccountDto> accountListToAccountDtoList(List<Account> accountList);
}

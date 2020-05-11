package kg.megacom.restaurantservice;

import kg.megacom.restaurantservice.mappers.AccountMapper;
import kg.megacom.restaurantservice.model.dto.AccountDto;
import kg.megacom.restaurantservice.model.entity.Account;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestMapperAccount {
    @Test
    public void accountTest(){
        AccountDto accountDto=new AccountDto();
        accountDto.setLogin("abc");
        accountDto.setPassword("12345abc");
        Account account= AccountMapper.INSTANCE.accountDtoToAccount(accountDto);
        AccountDto found=AccountMapper.INSTANCE.accountToAccountDto(account);
        assertEquals(found.getLogin(),accountDto.getLogin());
        assertEquals(found.getPassword(),accountDto.getPassword());
    }
}

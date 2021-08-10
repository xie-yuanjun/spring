package demo.mapper;

import demo.TestBase;
import demo.entity.Account;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author admin
 * @Title: AccountMapperTest
 * @ProjectName spring
 * @Description: TODO
 * @date 2021/6/1020:25
 */
public class AccountMapperTest extends TestBase {
    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void selectAllTest(){
        List<Account> accountList = accountMapper.selectAll();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }

    @Test
    public void updateMoney(){
        int i = accountMapper.updateMoney(1, 500);
        System.out.println(i);
    }
}

package demo.service;

import demo.TestBase;
import demo.entity.Account;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author admin
 * @Title: AccountServiceTest
 * @ProjectName spring
 * @Description: TODO
 * @date 2021/6/1021:25
 */
public class AccountServiceTest extends TestBase {
    @Autowired
    private AccountService accountService;

    @Test
    public void transferAccountsTest() throws InterruptedException {
        boolean issuccess = false;
        try {
            issuccess = accountService.transferAccounts(1, 2, 100);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        if (issuccess) {
            System.out.println("转账成功！");
        } else {
            System.out.println("转账失败！");
        }
    }

    /**
     * 读已提交测试--只能读到其他事务已提交的数据
     */
    @Test
    public  void readCommittiedTest(){
        accountService.readCommittied();
    }

    /**
     * 读未提交测试--可以读到其他事务中未提交的数据
     */
    @Test
    public void readUncommittiedTest(){
        accountService.readUncommittied();
    }

    /**
     * 可重复读--第一次读取时只能读取到已提交的数据，多次重复读取，与第一次读取数据一致。
     */
    @Test
    public void repeatableRead(){
        accountService.repeatableRead();
    }
}

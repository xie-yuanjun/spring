package demo.service.impl;

import demo.entity.Account;
import demo.mapper.AccountMapper;
import demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Scanner;

/**
 * @author admin
 * @Title: AccountServiceImpl
 * @ProjectName spring
 * @Description: TODO
 * @date 2021/6/1021:12
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    /**
     * 转账业务
     *
     * @param inId  转入账号
     * @param outId 转出账号
     * @param money 转账金额
     * @return
     */
    @Transactional(isolation = Isolation.READ_UNCOMMITTED)
    public boolean transferAccounts(int inId, int outId, int money) throws InterruptedException {
        if (moneyEnoughCheck(outId, money)) {
            accountMapper.updateMoney(outId, -money);
            System.out.println("资金已转出！");
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入1抛出异常中断，输入其它字符继续：");
            String i = scanner.next();
            if (i.equals("1")) {
                throw new RuntimeException("转账业务出现异常！");
            }
            accountMapper.updateMoney(inId, money);
            System.out.println("资金已转入！");
            scanner.close();
            return true;
        }
        return false;
    }

    /**
     * 资金是否充足查询业务
     *
     * @param id    账号
     * @param money 资金
     * @return
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public boolean moneyEnoughCheck(int id, int money) {
        int accountMoney = accountMapper.selectMoney(id);
        if (accountMoney < money)
            return false;
        return true;
    }

    /**
     * 查询某一个账号的资金
     *
     * @param id 账号
     * @return
     */
    @Transactional
    public int selectMoney(int id) {
        int money = accountMapper.selectMoney(id);
        return money;
    }

    /**
     * 读已提交
     *
     * @return
     */
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void readCommittied() {
        List<Account> accounts1 = accountMapper.selectAll();
        for (Account account : accounts1) {
            System.out.println(account);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入任意字符继续：");
        scanner.next();
        List<Account> accountList2 = accountMapper.selectAll();
        for (Account account : accountList2) {
            System.out.println(account);
        }
        scanner.close();
    }

    /**
     * 读未提交
     *
     * @return
     */
    @Transactional(isolation = Isolation.READ_UNCOMMITTED)
    public void readUncommittied() {
        List<Account> accounts1 = accountMapper.selectAll();
        for (Account account : accounts1) {
            System.out.println(account);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入任意字符继续：");
        scanner.next();
        List<Account> accountList2 = accountMapper.selectAll();
        for (Account account : accountList2) {
            System.out.println(account);
        }
        scanner.close();
    }

    /**
     * 可重复读
     */
    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public void repeatableRead() {
        List<Account> accounts1 = accountMapper.selectAll();
        for (Account account : accounts1) {
            System.out.println(account);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入任意字符继续：");
        scanner.next();
        List<Account> accountList2 = accountMapper.selectAll();
        for (Account account : accountList2) {
            System.out.println(account);
        }
        scanner.close();
    }

    /**
     * 串行化
     */
    public void serializable() {
        List<Account> accounts1 = accountMapper.selectAll();
        for (Account account : accounts1) {
            System.out.println(account);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入任意字符继续：");
        scanner.next();
        List<Account> accountList2 = accountMapper.selectAll();
        for (Account account : accountList2) {
            System.out.println(account);
        }
        scanner.close();
    }


}

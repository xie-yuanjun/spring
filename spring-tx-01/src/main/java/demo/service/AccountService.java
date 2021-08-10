package demo.service;

import demo.entity.Account;

import java.util.List;

/**
 * @author admin
 * @Title: AccountService
 * @ProjectName spring
 * @Description: 账号相关业务类
 * @date 2021/6/1021:12
 */
public interface AccountService {
    /**
     * 转账业务
     *
     * @param inId  转入账号
     * @param outId 转出账号
     * @param money 转账金额
     * @return
     */
    boolean transferAccounts(int inId, int outId, int money) throws InterruptedException;

    /**
     * 资金是否充足查询业务
     *
     * @param id    账号
     * @param money 资金
     * @return
     */
    boolean moneyEnoughCheck(int id, int money);

    /**
     * 查询某一个账号的资金
     *
     * @param id 账号
     * @return
     */
    int selectMoney(int id);

    /**
     * 读已提交
     *
     * @return
     */
    void readCommittied();

    /**
     * 读未提交
     *
     * @return
     */
    void readUncommittied();

    /**
     * 可重复读
     */
    void repeatableRead();

    /**
     * 串行化
     */
    void serializable();
}

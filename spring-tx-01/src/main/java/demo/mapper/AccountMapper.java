package demo.mapper;

import demo.entity.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author admin
 * @Title: AccountMapper
 * @ProjectName spring
 * @Description: TODO
 * @date 2021/6/1020:22
 */
public interface AccountMapper {

    List<Account> selectAll();

    int updateMoney(@Param("id") int id, @Param("money") int money);

    int selectMoney(int id);
}

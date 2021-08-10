package demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author admin
 * @Title: Account
 * @ProjectName spring
 * @Description: TODO
 * @date 2021/6/1020:21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "name")
public class Account {
    private int id;
    private String name;
    private int money;
}

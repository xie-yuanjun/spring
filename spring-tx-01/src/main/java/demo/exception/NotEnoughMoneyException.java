package demo.exception;

/**
 * @author admin
 * @Title: NotEnoughMoneyException
 * @ProjectName spring
 * @Description: TODO
 * @date 2021/6/1020:34
 */
public class NotEnoughMoneyException extends RuntimeException {
    public NotEnoughMoneyException(){
        super();
    }

    public NotEnoughMoneyException(String message){
        super(message);
    }

    public NotEnoughMoneyException(String message, Throwable e){
        super(message, e);
    }
}

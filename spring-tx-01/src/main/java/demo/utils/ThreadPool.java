package demo.utils;


import java.util.List;

/**
 * @author admin
 * @Title: ThreadPool
 * @ProjectName spring
 * @Description: TODO
 * @date 2021/6/1019:21
 */
public class ThreadPool {
    private final static int THREAD_NUM = 5;
    private static int workThread;
    //任务队列
//    private static List<Task> TaskQueue;
    private static ThreadPool threadPool;

    private ThreadPool(){
    }

    public static ThreadPool getInstance(){
        if (threadPool == null){
            threadPool = new ThreadPool();
        }
        return threadPool;
    }


}

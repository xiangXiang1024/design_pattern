package singleton.multi_thread;

/**
 * @author: xiang
 * @date: 2020/11/27
 * @description:
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}



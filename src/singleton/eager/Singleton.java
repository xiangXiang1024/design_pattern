package singleton.eager;

/**
 * @author: xiang
 * @date: 2020/11/26
 * @description:
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}



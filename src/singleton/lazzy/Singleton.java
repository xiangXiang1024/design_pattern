package singleton.lazzy;

/**
 * @author: xiang
 * TODO
 * @date: 2020/11/26
 * @description:
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}



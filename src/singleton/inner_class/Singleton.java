package singleton.inner_class;

/**
 * @author: xiang
 * TODO
 * @date: 2020/11/27
 * @description:
 */
public class Singleton {
    private Singleton (){}

    public static final Singleton getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }
}

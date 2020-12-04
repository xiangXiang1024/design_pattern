package adapter.objectAdapter;

/**
 * @author: xiang
 * @date: 2020/12/4
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.targetRequest();
    }
}

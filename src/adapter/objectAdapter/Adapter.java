package adapter.objectAdapter;

/**
 * @author: xiang
 * @date: 2020/12/4
 * @description:
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void targetRequest() {
        System.out.println("do something");
        adaptee.adapteeRequest();
    }
}

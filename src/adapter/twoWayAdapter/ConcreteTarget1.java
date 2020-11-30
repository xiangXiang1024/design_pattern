package adapter.twoWayAdapter;

/**
 * @author: xiang
 * @date: 2020/11/27
 * @description:
 */
public class ConcreteTarget1 implements Target1 {
    @Override
    public void doSomething1() {
        System.out.println("do something1 in concrete target 1");
    }
}

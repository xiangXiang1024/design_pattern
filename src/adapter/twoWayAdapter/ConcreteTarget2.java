package adapter.twoWayAdapter;

/**
 * @author: xiang
 * @date: 2020/11/27
 * @description:
 */
public class ConcreteTarget2 implements Target2 {
    @Override
    public void doSomething2() {
        System.out.println("do something2 in concrete target 2");
    }
}

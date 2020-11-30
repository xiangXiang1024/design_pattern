package strategy;

/**
 * @author: xiang
 * @date: 2020/11/28
 * @description:
 */
public class ConcreteStrategy implements AbstractStrategy {
    @Override
    public void doSomething() {
        System.out.println("do something");
    }
}

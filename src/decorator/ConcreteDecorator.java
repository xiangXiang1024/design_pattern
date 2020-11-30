package decorator;

/**
 * @author: xiang
 * @date: 2020/11/30
 * @description:
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void doSomething() {
        System.out.println("concrete decorator do something");
        super.doSomething();
    }
}

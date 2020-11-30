package abstractFactory;

/**
 * @author: xiang
 * @date: 2020/11/27
 * @description:
 */
public class ConcreteFactory1 extends AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}

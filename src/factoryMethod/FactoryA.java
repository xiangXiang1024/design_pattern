package factoryMethod;

/**
 * @author: xiang
 * @date: 2020/11/27
 * @description:
 */
public class FactoryA extends AbstractFactory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}

package factoryMethod;

/**
 * @author: xiang
 * @date: 2020/11/27
 * @description:
 */
public class FactoryB extends AbstractFactory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}

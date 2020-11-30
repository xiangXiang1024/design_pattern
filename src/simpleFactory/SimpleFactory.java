package simpleFactory;

/**
 * @author: xiang
 * @date: 2020/11/27
 * @description:
 */
public class SimpleFactory {
    public Product createProduct(String s) {
        if(s.equals("A")) {
            return new ProductA();
        }else if(s.equals("B")) {
            return new ProductB();
        }
        return null;
    }
}

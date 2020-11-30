package templateMethod;

/**
 * @author: xiang
 * @date: 2020/11/28
 * @description:
 */
public class ConcreteClass extends AbstractClass {
    @Override
    void step1() {
        System.out.println("step1");
    }

    @Override
    void step2() {
        System.out.println("step2");
    }

    boolean hook2() {
        return false;
    }
}

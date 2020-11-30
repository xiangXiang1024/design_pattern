package templateMethod;

/**
 * @author: xiang
 * @date: 2020/11/28
 * @description:
 */
public abstract class AbstractClass {
    abstract void step1();

    abstract void step2();

    void hook1() {}

    boolean hook2() {
        return true;
    }

    public final void templateMethod() {
        step1();

        hook1();

        if(hook2()) {
            step2();
        }
    }
}

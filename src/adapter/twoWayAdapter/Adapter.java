package adapter.twoWayAdapter;

/**
 * @author: xiang
 * @date: 2020/11/27
 * @description:
 */
public class Adapter implements Target1, Target2 {
    private Target1 target1;
    private Target2 target2;

    public Target1 getTarget1() {
        return target1;
    }

    public Target2 getTarget2() {
        return target2;
    }

    @Override
    public void doSomething1() {
        target1.doSomething1();
    }

    @Override
    public void doSomething2() {
        target2.doSomething2();
    }
}

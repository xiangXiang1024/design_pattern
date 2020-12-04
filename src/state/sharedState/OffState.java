package state.sharedState;

/**
 * @author: xiang
 * @date: 2020/12/4
 * @description:
 */
public class OffState extends State {
    @Override
    public void turnOn(Switch s) {
        System.out.println("turn on the " + s.getName());
        s.setState(new OnState());
    }

    @Override
    public void turnOff(Switch s) {
        System.out.println(s.getName() + " has been off");
    }
}

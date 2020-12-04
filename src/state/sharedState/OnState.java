package state.sharedState;

/**
 * @author: xiang
 * @date: 2020/12/4
 * @description:
 */
public class OnState extends State {
    @Override
    public void turnOn(Switch s) {
        System.out.println(s.getName() + " has been opened");
    }

    @Override
    public void turnOff(Switch s) {
        System.out.println("turn off the " + s.getName());
        s.setState(new OffState());
    }
}

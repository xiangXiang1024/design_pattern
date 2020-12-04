package state.sharedState;

/**
 * @author: xiang
 * @date: 2020/12/4
 * @description:
 */
public class Switch {
    private String name;
    private static State state;

    public Switch(String name) {
        this.name = name;
        state = new OffState();
    }

    public String getName() {
        return name;
    }

    public void setState(State state) {
        Switch.state = state;
    }

    public void turnOn() {
        state.turnOn(this);
    }

    public void turnOff() {
        state.turnOff(this);
    }
}

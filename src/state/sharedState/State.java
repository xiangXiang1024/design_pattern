package state.sharedState;

/**
 * @author: xiang
 * @date: 2020/12/4
 * @description:
 */
public abstract class State {
    public abstract void turnOn(Switch s);

    public abstract void turnOff(Switch s);
}

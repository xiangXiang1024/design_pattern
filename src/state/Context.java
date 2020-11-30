package state;

/**
 * @author: xiang
 * @date: 2020/11/28
 * @description:
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle();
    }
}

package state;

/**
 * @author: xiang
 * @date: 2020/11/28
 * @description:
 */
public abstract class State {
    protected Context context;

    public State(Context context) {
        this.context = context;
    }

    public abstract void handle();
}

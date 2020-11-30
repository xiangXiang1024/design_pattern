package state;

/**
 * @author: xiang
 * @date: 2020/11/28
 * @description:
 */
public class ConcreteStateB extends State {
    public ConcreteStateB(Context context) {
        super(context);
    }

    @Override
    public void handle() {
        System.out.println("do something in state B");
        context.setState(new ConcreteStateA(context));
    }
}

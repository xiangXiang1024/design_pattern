package state;

/**
 * @author: xiang
 * @date: 2020/11/28
 * @description:
 */
public class ConcreteStateA extends State {
    public ConcreteStateA(Context context) {
        super(context);
    }

    @Override
    public void handle() {
        System.out.println("do something in state A");
        context.setState(new ConcreteStateB(context));
    }
}

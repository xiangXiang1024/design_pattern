package command;

/**
 * @author: xiang
 * @date: 2020/11/29
 * @description:
 */
public class ConcreteCommand extends AbstractCommand {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doSomething();
    }

    @Override
    public void undo() {
        receiver.undoSomething();
    }
}

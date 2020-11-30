package command;

/**
 * @author: xiang
 * @date: 2020/11/29
 * @description:
 */
public class Client {
    public void createCommand(Receiver receiver, Invoker invoker) {
        AbstractCommand command = new ConcreteCommand(receiver);
        invoker.setCommand(command);
    }
}

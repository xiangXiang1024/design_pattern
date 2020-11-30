package command;

/**
 * @author: xiang
 * @date: 2020/11/29
 * @description:
 */
public class Invoker {
    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void order() {
        command.execute();
    }
}

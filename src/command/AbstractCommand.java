package command;

/**
 * @author: xiang
 * @date: 2020/11/29
 * @description:
 */
public abstract class AbstractCommand {
    public abstract void execute();

    public abstract void undo();
}

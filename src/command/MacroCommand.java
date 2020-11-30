package command;

/**
 * @author: xiang
 * TODO
 * @date: 2020/11/29
 * @description:
 */
public class MacroCommand extends AbstractCommand {
    private AbstractCommand[] commands = new AbstractCommand[3];

    public MacroCommand(AbstractCommand[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(AbstractCommand command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for(int i = commands.length-1 ; i >= 0 ; i--) {
            commands[i].undo();
        }
    }
}

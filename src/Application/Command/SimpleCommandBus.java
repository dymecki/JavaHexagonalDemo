package Application.Command;

public final class SimpleCommandBus
{
    public void execute(CommandInterface command) throws Exception
    {
        this.handleObject(command).handle(command);
    }

    public CommandHandlerInterface handleObject(CommandInterface command) throws Exception
    {
        return (CommandHandlerInterface) Class.forName(command.getClass() + "Handler").newInstance();
    }
}

package Application.Command;

public interface CommandBusInterface {
    public void execute(CommandInterface command);
    public void handleObject(CommandInterface command);
}

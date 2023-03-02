package BehavioralPattern.CommandPattern;
import java.util.ArrayList;
import java.util.List;
public  class VendingMachineCommand {
    private final List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    public void pressButton(int button) {
        if (button >= 0 && button < commands.size()) {
            Command command = commands.get(button);
            command.execute();
        }
    }
}

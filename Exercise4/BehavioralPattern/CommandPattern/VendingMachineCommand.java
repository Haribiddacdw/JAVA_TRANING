package BehavioralPattern.CommandPattern;
import java.util.ArrayList;
import java.util.List;

//class VendingMachineCommand as invoker
public  class VendingMachineCommand {
    private final List<Command> commands = new ArrayList<>();


    //addCommand method add command to invoker
    public void addCommand(Command command) {
        commands.add(command);
    }
    //removeCommand method remove command from invoker
    public void removeCommand(Command command) {
        commands.remove(command);
    }
   
    //pressButton method visible to client
    public void pressButton(int button) {
        if (button >= 0 && button < commands.size()) {
            Command command = commands.get(button);
            command.execute();
        }
    }
}

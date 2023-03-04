package BehavioralPattern.CommandPattern;

/**
The TeaCommand class implements the Command interface and represents a command to prepare tea.
*/
class TeaCommand implements Command {
    private final Tea tea;

    public TeaCommand(Tea tea) {
        this.tea = tea;
    }

/**
Executes the command to prepare the Tea object.
*/
    @Override
    public void execute() {
        tea.prepare();
    }
     //this execute () method invokes the appropriate action method of a Receiver class
}
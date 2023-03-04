package BehavioralPattern.CommandPattern;

/**
The MilkCommand class implements the Command interface and represents a command to prepare milk.
*/
class MilkCommand implements Command {
    private final Milk milk;

    public MilkCommand(Milk milk) {
        this.milk = milk;
    }

    @Override
    public void execute() {
        milk.prepare(); 
    /**
      * this execute () method invokes the appropriate action method of a Receiver class 
        Executes the command to prepare the Milk object.
      */
    }
}

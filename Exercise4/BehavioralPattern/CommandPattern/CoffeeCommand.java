package BehavioralPattern.CommandPattern;

/**
The CoffeeCommand class implements the Command interface and represents a command to prepare coffee.
*/
class CoffeeCommand implements Command {
    private final Coffee coffee;

    public CoffeeCommand(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void execute() {
        coffee.prepare();
    }
     
     /**
      * this execute () method invokes the appropriate action method of a Receiver class 
        Executes the command to prepare the Tea object.
      */

}

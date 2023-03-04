package BehavioralPattern.CommandPattern;
/*@author Hari Prasath V
 *  @version 1.0
 */

              //client
public class VendingMachine {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Create RECEIVER objects 
        Tea tea = new Tea();   
        Coffee coffee = new Coffee();
        Milk milk = new Milk(); 
    
        // Create command objects
        Command teaCommand = new TeaCommand(tea);
        Command coffeeCommand = new CoffeeCommand(coffee);
        Command milkCommand = new MilkCommand(milk);
    
        // Create vending machine object (INVOKER)
        VendingMachineCommand vendingMachine = new  VendingMachineCommand();
    
        // Add commands to vending machine
        vendingMachine.addCommand(teaCommand);
        vendingMachine.addCommand(coffeeCommand);
        vendingMachine.addCommand(milkCommand);
    
        // Simulate button presses
        vendingMachine.pressButton(0); // Serve tea
        // vendingMachine.pressButton(1); // Serve coffee
        // vendingMachine.pressButton(2); // Serve milk
    }
}








/*
Command is an interface with execute() method. 

The Client creates an instance of a command implementation and associates it with a receiver.

An Invoker instructs the command to perform an action.

Command implementation’s instance creates a binding between the receiver and an action.

Receiver is the object that knows the actual steps to perform the action. Any class may serve as a Receiver.
 */
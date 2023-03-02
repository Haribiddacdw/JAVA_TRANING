package BehavioralPattern.CommandPattern;
/*@author Hari Prasath V
 *  @version 1.0
 */
 /** Import required packages
  */

   
public class VendingMachine {
    /**
     *
     * @param args
     * @return null
     */
    public static void main(String[] args) {
        // Create beverage objects
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        Milk milk = new Milk();
    
        // Create command objects
        Command teaCommand = new TeaCommand(tea);
        Command coffeeCommand = new CoffeeCommand(coffee);
        Command milkCommand = new MilkCommand(milk);
    
        // Create vending machine object
        VendingMachineCommand vendingMachine = new  VendingMachineCommand();
    
        // Add commands to vending machine
        vendingMachine.addCommand(teaCommand);
        vendingMachine.addCommand(coffeeCommand);
        vendingMachine.addCommand(milkCommand);
    
        // Simulate button presses
        vendingMachine.pressButton(0); // Serve tea
        vendingMachine.pressButton(1); // Serve coffee
        vendingMachine.pressButton(2); // Serve milk
    }
}




package BehavioralPattern.CommandPattern;

class CoffeeCommand implements Command {
    private final Coffee coffee;

    public CoffeeCommand(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void execute() {
        coffee.prepare();
    }
}

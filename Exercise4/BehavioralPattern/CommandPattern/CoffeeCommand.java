package BehavioralPattern.CommandPattern;

class CoffeeCommand extends Command {
    private final Coffee coffee;

    public CoffeeCommand(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void execute() {
        coffee.prepare();
    }
}

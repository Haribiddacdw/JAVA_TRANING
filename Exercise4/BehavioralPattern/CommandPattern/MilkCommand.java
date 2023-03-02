package BehavioralPattern.CommandPattern;

class MilkCommand extends Command {
    private final Milk milk;

    public MilkCommand(Milk milk) {
        this.milk = milk;
    }

    @Override
    public void execute() {
        milk.prepare();
    }
}

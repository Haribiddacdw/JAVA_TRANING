package BehavioralPattern.CommandPattern;

class TeaCommand implements Command {
    private final Tea tea;

    public TeaCommand(Tea tea) {
        this.tea = tea;
    }

    @Override
    public void execute() {
        tea.prepare();
    }
}
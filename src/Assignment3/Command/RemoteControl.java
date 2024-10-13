package Assignment3.Command;

public class RemoteControl {
    private Command[] commands;

    public RemoteControl() {
        commands = new Command[6];
    }

    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    public void pressButton(int slot) {
        commands[slot].execute();
    }
}
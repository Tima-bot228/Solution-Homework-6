import java.util.HashMap;
import java.util.Map;

public class SmartHomeRemoteControl {
    private Map<String, Command> commands = new HashMap<>();
    private Command lastCommand;

    public void setCommand(String slot, Command command) {
        commands.put(slot, command);
    }

    public void pressButton(String slot) {
        Command command = commands.get(slot);
        if (command != null) {
            command.execute();
            lastCommand = command;
        } else {
            System.out.println("[Remote] No command assigned to: " + slot);
        }
    }

    public void pressUndo() {
        if (lastCommand != null) {
            lastCommand.undo();
        } else {
            System.out.println("[Remote] Nothing to undo.");
        }
    }
}

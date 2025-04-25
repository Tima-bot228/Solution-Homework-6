public class SmartHomeDemo {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        Command lightCommand = new TurnOnLightCommand(light);
        Command tempCommand = new SetThermostatCommand(thermostat, 22);

        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();

        remote.setCommand("light", lightCommand);
        remote.setCommand("climate", tempCommand);

        remote.pressButton("light");
        remote.pressButton("climate");
        remote.pressUndo();
    }
}

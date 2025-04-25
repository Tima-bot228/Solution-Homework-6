public class SetThermostatCommand implements Command {
    private Thermostat thermostat;
    private int newTemp;

    public SetThermostatCommand(Thermostat thermostat, int newTemp) {
        this.thermostat = thermostat;
        this.newTemp = newTemp;
    }

    @Override
    public void execute() {
        thermostat.setTemperature(newTemp);
    }

    @Override
    public void undo() {
        thermostat.undoSetTemperature();
    }
}

public class Thermostat {
    private int temperature = 20;

    public void setTemperature(int temp) {
        System.out.println("[Thermostat] Setting temperature to " + temp + "°C");
        temperature = temp;
    }

    public void undoSetTemperature() {
        System.out.println("[Thermostat] Reverting temperature to default 20°C");
        temperature = 20;
    }
}

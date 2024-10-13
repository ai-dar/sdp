package Assignment3.Mediator;

public class TemperatureSensor extends Sensor {
    public TemperatureSensor(HomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void sendData() {
        String data = "Temperature: 22°C";
        mediator.collectData(data);
    }
}
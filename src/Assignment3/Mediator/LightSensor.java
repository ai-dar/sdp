package Assignment3.Mediator;

public class LightSensor extends Sensor {
    public LightSensor(HomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void sendData() {
        String data = "Light: 300 lux";
        mediator.collectData(data);
    }
}
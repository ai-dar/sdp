package Assignment3.Mediator;

public class HumiditySensor extends Sensor {
    public HumiditySensor(HomeMediator mediator) {
        super(mediator);
    }

    @Override
    public void sendData() {
        String data = "Humidity: 60%";
        mediator.collectData(data);
    }
}
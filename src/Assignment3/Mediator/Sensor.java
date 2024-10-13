package Assignment3.Mediator;

abstract class Sensor {
    protected HomeMediator mediator;

    public Sensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void sendData();
}
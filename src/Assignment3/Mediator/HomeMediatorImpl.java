package Assignment3.Mediator;

public class HomeMediatorImpl implements HomeMediator {
    private String temperatureData;
    private String humidityData;
    private String lightData;

    @Override
    public void collectData(String data) {
        if (data.startsWith("Temperature:")) {
            temperatureData = data;
        } else if (data.startsWith("Humidity:")) {
            humidityData = data;
        } else if (data.startsWith("Light:")) {
            lightData = data;
        }
    }

    @Override
    public void printReport() {
        System.out.println("Home Report:");
        System.out.println(temperatureData);
        System.out.println(humidityData);
        System.out.println(lightData);
    }

    @Override
    public void reportData() {
        printReport();
    }
}
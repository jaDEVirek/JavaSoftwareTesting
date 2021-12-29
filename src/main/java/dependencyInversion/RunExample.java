package dependencyInversion;

public class RunExample {

    public static void main(String[] args) throws InterruptedException {
        final Thermometer thermometer = new Thermometer();
        final AirConditioner airConditioner = new AirConditioner(0.2812f, thermometer);
        airConditioner.start();
    }
}

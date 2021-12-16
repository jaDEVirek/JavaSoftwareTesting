package dependencyInversion;


import java.util.Random;
import java.util.concurrent.TimeUnit;

public class AirConditioner {
    private static final float THRESHOLD = 3;

    private final float desiredTemperature;
    private final Sensor sensor; // it should be changed for interface

    public AirConditioner(float desiredTemperature, /* Thermometer thermometer*/ Sensor sensor) {
        this.desiredTemperature = desiredTemperature;
        this.sensor = sensor;
    }

    public void start() throws InterruptedException {
        while (true) {
            if (sensor.measure() > desiredTemperature) {
                coolDown();
            }
            System.out.println("It's cool.");
            TimeUnit.SECONDS.sleep(5);
        }
    }

    private void coolDown() throws InterruptedException {
        while (sensor.measure() > desiredTemperature - THRESHOLD) {
            System.out.println("Cooling down");
            // cooling down somehow ;)
            TimeUnit.SECONDS.sleep(5);
        }
    }
}


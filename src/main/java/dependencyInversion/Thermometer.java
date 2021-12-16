package dependencyInversion;

import java.util.Random;

public class Thermometer implements Sensor {
    public float measure() {
        return new Random().nextFloat();
    }
}

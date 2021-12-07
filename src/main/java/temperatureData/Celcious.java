package temperatureData;

import java.math.BigDecimal;

public class Celcious implements TemperatureUnit {

    private final BigDecimal tempVal;

    public Celcious(BigDecimal tempVal) {
        if (BigDecimal.valueOf(-273.15)
                .compareTo(tempVal) > 0) {
            throw  new IllegalArgumentException("Temperature can't be below -273.15C");
        }
        this.tempVal = tempVal.setScale(SCALE, ROUNDING_MODE);
    }

}

package temperatureData;

import java.math.BigDecimal;
import java.security.InvalidParameterException;

public class Fahrenheit implements TemperatureUnit {

    private final BigDecimal tempVal;
    private static final BigDecimal CELCIOUS_CONVERSION = new BigDecimal("-32")
            .setScale(SCALE, ROUNDING_MODE);

    public Fahrenheit(BigDecimal value) {
        if (BigDecimal.valueOf(-459.67)
                .compareTo(value) > 0) {
            throw new InvalidParameterException("Temperature can't be lower than -459.67F");
        }
        tempVal = value.setScale(SCALE, ROUNDING_MODE);
    }

    public Celcious convertToCelcious() {
        return new Celcious((tempVal.add(CELCIOUS_CONVERSION)
                .multiply(new BigDecimal("0.5556"))).setScale(SCALE, ROUNDING_MODE));
    }
}

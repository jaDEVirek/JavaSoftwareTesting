package temperatureData;

import java.math.BigDecimal;
import java.security.InvalidParameterException;

public class Kelvin implements TemperatureUnit {


    private static final BigDecimal CELCIOUS_CONVERSION = new BigDecimal("-273,15").setScale(SCALE, ROUNDING_MODE);
    private final BigDecimal value;

    public Kelvin(BigDecimal value) {
        if (BigDecimal.valueOf(0)
                .compareTo(value) > 0) {
            throw new InvalidParameterException("Temperature can't be lower than 0");
        }
        this.value = value;
    }

    public Celcious convertToCelcious() {
        return new Celcious(value.add(CELCIOUS_CONVERSION)
                .setScale(SCALE, ROUNDING_MODE));
    }

    public Fahrenheit convertToFahrenheit() {
        return new Fahrenheit(convertToCelcious().getValue()
                .multiply(new BigDecimal("0.5556"))
                .setScale(SCALE, ROUNDING_MODE));
    }
}

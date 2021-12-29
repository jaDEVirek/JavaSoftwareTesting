import lengthData.Inch;
import org.junit.jupiter.api.Test;
import temperatureData.Celcious;
import temperatureData.Fahrenheit;

import java.math.BigDecimal;
import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FahrenheitTest {

    @Test
    void shouldConvertOneFahrenheitValueToCelcious() {
        final Celcious celcious = new Fahrenheit(BigDecimal.ONE).convertToCelcious();
        assertEquals(new BigDecimal("-17.22"), celcious.getValue());
    }

    @Test
    void shouldConvertZeroToZeroCelsiusValueToCelcious() {
        Celcious c= new Fahrenheit(BigDecimal.ZERO).convertToCelcious();
        assertEquals(new BigDecimal("-17.77"), c.getValue());
    }

    @Test
    void shouldntAcceptTooLowFahrenheitTemperature() {
        InvalidParameterException exception = assertThrows(
                InvalidParameterException.class,
                () -> new Fahrenheit(BigDecimal.valueOf(-461.47))
        );
        assertEquals("Temperature can't be lower than -459.67F", exception.getMessage());
    }
}

import org.junit.jupiter.api.Test;
import temperatureData.Celcious;
import temperatureData.Fahrenheit;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}

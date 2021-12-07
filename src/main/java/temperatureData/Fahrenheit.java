package temperatureData;

import java.math.BigDecimal;

public class Fahrenheit implements TemperatureUnit{

    private final BigDecimal tempVal;

    public Fahrenheit(BigDecimal value) {
        if(BigDecimal.valueOf(-459.67).compareTo(value)>0){
            throw new IllegalArgumentException("");
        }
        tempVal= value.setScale(SCALE,ROUNDING_MODE);
    }

    public Celcious convertToCelcious(){

    }
}

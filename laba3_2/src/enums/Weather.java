package src.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Weather {
    SUNNY,
    WINDY,
    CLOUDY,
    RAINY;

    private static final List<Weather> values =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = values.size();
    private static final Random random = new Random();

    public static Weather randomWeather()  {
        return values.get(random.nextInt(SIZE));
    }
}


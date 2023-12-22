package src.innerFuncs;

import src.enums.Weather;
import src.objects.Nature;

public class ChangeWeather {
    public static void changeWeather(Weather weather){
        Nature.setWeather(weather);
        System.out.println("-> Погода стала " + weather);
    }
}

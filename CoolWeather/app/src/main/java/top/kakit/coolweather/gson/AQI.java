package top.kakit.coolweather.gson;

/**
 * Created by kakit on 2017/10/31.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }

}

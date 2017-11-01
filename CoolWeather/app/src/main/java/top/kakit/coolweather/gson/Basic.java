package top.kakit.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kakit on 2017/10/30.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String wetherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }

}

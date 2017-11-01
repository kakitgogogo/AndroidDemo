package top.kakit.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kakit on 2017/10/31.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Templature templature;

    @SerializedName("cond")
    public More more;

    public class Templature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}

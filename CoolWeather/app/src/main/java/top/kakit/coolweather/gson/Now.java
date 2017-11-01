package top.kakit.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kakit on 2017/10/31.
 */

public class Now {

    @SerializedName("tmp")
    public String templature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }

}

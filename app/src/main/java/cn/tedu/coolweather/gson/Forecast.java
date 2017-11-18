package cn.tedu.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created with Android Studio.
 * Package: cn.tedu.coolweather.gson
 * Description:
 *
 * @author Mr.hzwangf
 * @version 1.0
 *          Date: 2017-11-18
 *          Time: 21:38
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }
}

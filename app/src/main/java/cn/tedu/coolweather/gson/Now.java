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
 *          Time: 21:31
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;


    public class More {
        @SerializedName("txt")
        public String info;

    }
}

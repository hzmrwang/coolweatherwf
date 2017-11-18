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
 *          Time: 21:27
 */

public class Basic {

    @SerializedName("city")
    public  String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }

}

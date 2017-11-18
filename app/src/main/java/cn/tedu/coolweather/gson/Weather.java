package cn.tedu.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created with Android Studio.
 * Package: cn.tedu.coolweather.gson
 * Description:
 *
 * @author Mr.hzwangf
 * @version 1.0
 *          Date: 2017-11-18
 *          Time: 21:41
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}

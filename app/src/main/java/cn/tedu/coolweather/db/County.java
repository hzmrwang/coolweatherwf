package cn.tedu.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created with Android Studio.
 * Package: cn.tedu.coolweather.db
 * Description:
 *
 * @author Mr.hzwangf
 * @version 1.0
 *          Date: 2017-11-18
 *          Time: 20:08
 */

public class County extends DataSupport {

    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}

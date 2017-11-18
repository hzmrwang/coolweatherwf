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
 *          Time: 20:07
 */

public class City extends DataSupport {

    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}

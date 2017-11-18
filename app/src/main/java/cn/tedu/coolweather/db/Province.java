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
 *          Time: 20:05
 */

public class Province extends DataSupport {

    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}

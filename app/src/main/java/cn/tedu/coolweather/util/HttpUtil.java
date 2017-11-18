package cn.tedu.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created with Android Studio.
 * Package: cn.tedu.coolweather.util
 * Description:
 *
 * @author Mr.hzwangf
 * @version 1.0
 *          Date: 2017-11-18
 *          Time: 20:15
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}

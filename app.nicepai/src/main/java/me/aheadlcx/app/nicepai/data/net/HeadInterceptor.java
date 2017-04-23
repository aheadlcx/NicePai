package me.aheadlcx.app.nicepai.data.net;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;


/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/23 下午6:31
 */
public class HeadInterceptor implements Interceptor {
    private static final String TAG = "HeadInterceptor";

    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();

        return chain.proceed(original.newBuilder().
                method(original.method(), original.body()).
                build());


//                addHeader("APPID", Constants.VIA_SSO_LOGIN).
//                addHeader("APPVER", Statistics.DEFAULT_APP_VERSION).
//                addHeader("VUSER", MrService.vuser).
//                addHeader("C-NETWORK", NetworkDash.getType().getName()).
//                addHeader("C-SCREEN-SCALE", String.valueOf(ViewUtils.getDensity())).
//                addHeader("C-PIC-MODE", Constants.VIA_TO_TYPE_QQ_GROUP).
//                addHeader("C-SCREEN-WIDTH", String.valueOf(Ext.g().getScreenWidth())).
//                addHeader("C-SCREEN-HEIGHT", String.valueOf(Ext.g().getScreenHeight())).
    }
}

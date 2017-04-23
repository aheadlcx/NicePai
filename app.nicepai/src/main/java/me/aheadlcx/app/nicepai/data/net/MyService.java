package me.aheadlcx.app.nicepai.data.net;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLSocketFactory;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.Retrofit.Builder;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/23 下午6:08
 */
public final class MyService {
    private Retrofit mRetrofit;
    private String API_PRODUCT_URL = "http://api.miaopai.com/";

    private static class MyServiceInner {
        public static MyService sService = new MyService();
        public static MyService syncService = new MyService();
    }

    public static MyService getInstance() {
        return MyServiceInner.sService;
    }

    public static MyService getSynchronousInstance() {
        return MyServiceInner.syncService;
    }

    public MyService() {
        this(true);
    }

    public MyService(boolean isUseRxJava) {
        Builder builder = new Builder().baseUrl(API_PRODUCT_URL).addConverterFactory(GsonConverterFactory.create()).client(getClient());
        if (isUseRxJava) {
            builder.addCallAdapterFactory(RxJavaCallAdapterFactory.create());
        }
        this.mRetrofit = builder.build();
    }

    public <T> T createApi(Class<T> targetClazz) {
        return this.mRetrofit.create(targetClazz);
    }

    private OkHttpClient getClient() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
        SSLSocketFactory sslSocketFactory = null;
//        try {
//            TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
//                public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
//                }
//
//                public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
//                }
//
//                public X509Certificate[] getAcceptedIssuers() {
//                    return new X509Certificate[0];
//                }
//            }};
//            SSLContext sslContext = SSLContext.getInstance("SSL");
//            sslContext.init(null, trustAllCerts, new SecureRandom());
//            sslSocketFactory = sslContext.getSocketFactory();
//        } catch (Exception e) {
//            Logger.e(TAG, e.getMessage());
//        }
        return new OkHttpClient.Builder().addInterceptor(new HeadInterceptor()).addInterceptor(logging).
                connectTimeout(10, TimeUnit.SECONDS).
                readTimeout(20, TimeUnit.SECONDS).
//                sslSocketFactory(sslSocketFactory).
//                hostnameVerifier(MrService$$Lambda$1.lambdaFactory$()).
                        cookieJar(new CookieJar() {
            private final HashMap<HttpUrl, List<Cookie>> cookieStore = new HashMap();

            public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
                this.cookieStore.put(HttpUrl.parse(url.host()), cookies);
            }

            public List<Cookie> loadForRequest(HttpUrl url) {
                List<Cookie> cookies = (List) this.cookieStore.get(HttpUrl.parse(url.host()));
                return cookies != null ? cookies : new ArrayList();
            }
        }).build();
    }
}

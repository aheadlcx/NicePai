package me.aheadlcx.nicepai.base;

import android.support.v4.app.Fragment;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscription;

/**
 * Description:
 * Creator: ZhangJinWei
 * Date:16/2/29 下午8:07
 */
public class BaseFragment extends Fragment {

    private List<Subscription> mSubscriptions = new ArrayList<>();

    public void addSubscription(Subscription subscription){
        mSubscriptions.add(subscription);
    }


        @Override
        public void onDestroy() {
        if (mSubscriptions != null && mSubscriptions.size() >0) {
            for (Subscription subscription: mSubscriptions) {
                if (subscription.isUnsubscribed()){
                    subscription.unsubscribe();
                }
            }
        }
        super.onDestroy();
    }

    public Retrofit getRetrofit(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.miaopai.com/")
                .client(new OkHttpClient())
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        return retrofit;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser){
            onResumeFrag();
        }
    }

    private void onResumeFrag() {

    }
}

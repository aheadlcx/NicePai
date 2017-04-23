package me.aheadlcx.app.nicepai.test;

import android.os.Bundle;
import android.support.annotation.Nullable;

import me.aheadlcx.app.nicepai.base.BaseActivity;
import rx.Observable;
import rx.Subscriber;

/**
 * Description:
 * Creator: aheadlcx
 * Date:11/11/2016 5:07 PM
 */

public class TestRxJava extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Subscriber
//        Observable.OnSubscribe
        Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("Ss");
                subscriber.onCompleted();
            }
        });

//        Observable.just()
    }
}

package me.aheadlcx.nicepai;

import android.app.Application;

import me.aheadlcx.nicepai.internal.di.component.ApplicationComponent;
import me.aheadlcx.nicepai.internal.di.component.DaggerApplicationComponent;
import me.aheadlcx.nicepai.internal.di.modules.ApplicationModule;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/23 下午6:55
 */
public class App extends Application {
    private ApplicationComponent mApplicationComponent;

    private static App sApp;

    @Override
    public void onCreate() {
        sApp = this;
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
//                .apiModule(new ApiModule())
                .build();
        super.onCreate();
    }

    public static App getApp() {
        return sApp;
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }
}

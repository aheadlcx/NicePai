package me.aheadlcx.app.nicepai;

import android.app.Application;

import me.aheadlcx.app.nicepai.internal.di.component.ApplicationComponent;
import me.aheadlcx.app.nicepai.internal.di.component.DaggerApplicationComponent;
import me.aheadlcx.app.nicepai.internal.di.modules.ApplicationModule;

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
//        initHealth();
    }

    private void initHealth() {
//        HealthSdk.initHealth(this);
//        MyApplication healthApp = new MyApplication();
//        healthApp.initComponent(this);
//        healthApp.initDb(this);
//        healthApp.setInstance(healthApp);
    }

    public static App getApp() {
        return sApp;
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }
}

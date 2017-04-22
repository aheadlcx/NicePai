package me.aheadlcx.app;

import android.os.Environment;
import android.support.multidex.MultiDexApplication;

import java.io.File;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import me.aheadlcx.app.health.di.components.ApplicationComponent;
import me.aheadlcx.app.health.di.components.DaggerApplicationComponent;
import me.aheadlcx.app.health.di.modules.ApplicationModule;
import me.aheadlcx.app.health.util.HealthSdk;

/**
 * Description:
 * Creator: aheadlcx
 * Date:2016/11/28 上午10:20
 */

public class MyApplication extends MultiDexApplication {
    private ApplicationComponent applicationComponent;
    private static MyApplication instance;
    @Override
    public void onCreate() {
        super.onCreate();
        HealthSdk.initHealth(this);
        instance = this;
         applicationComponent= DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this))
                .build();

        initDb();
    }

    private void initDb() {
//        Realm.init(this);
        Environment.getExternalStorageState();
        String filePath = Environment.getExternalStorageDirectory().getPath() + File.separator + "nicelife";
        File file = new File(filePath);
        if (!file.exists()){
            file.mkdirs();
        }
        RealmConfiguration configuration =new RealmConfiguration.Builder(this)
                .build();
//        Realm.deleteRealm(configuration);
        Realm.setDefaultConfiguration(configuration);
    }

    public static MyApplication getInstance() {
        return instance;
    }

    public ApplicationComponent getApplicationComponent(){
        return applicationComponent;
    }
}

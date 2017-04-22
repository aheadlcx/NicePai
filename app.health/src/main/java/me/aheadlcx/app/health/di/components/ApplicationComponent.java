package me.aheadlcx.app.health.di.components;

import javax.inject.Singleton;

import dagger.Component;
import me.aheadlcx.app.health.di.modules.ActivityModule;
import me.aheadlcx.app.health.di.modules.ApplicationModule;

/**
 * Description:
 * Creator: aheadlcx
 * Date:2016/11/28 上午10:24
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
//    void inject(BaseActivity baseActivity);

//    Context getContext();

//    ThreadExecutor threadExecutor();

//    PostExecutionThread postExecutionThread();

//    HealthNewsRepository provideHealthNewsRepo();

    ActivityComponent plus(ActivityModule module);

}

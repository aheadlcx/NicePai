package me.aheadlcx.app.health.di.modules;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.aheadlcx.app.MyApplication;
import me.aheadlcx.app.health.data.repository.HealthNewsDataRepository;
import me.aheadlcx.app.health.di.JobExecutor;
import me.aheadlcx.app.health.di.UiThread;
import me.aheadlcx.app.health.domain.executor.PostExecutionThread;
import me.aheadlcx.app.health.domain.executor.ThreadExecutor;
import me.aheadlcx.app.health.domain.repository.HealthNewsRepository;

/**
 * Description:
 * Creator: aheadlcx
 * Date:2016/11/28 上午10:26
 */

@Module
public class ApplicationModule {
    private Context mApplication;

    public ApplicationModule(Context application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    public Context provideApplicationContext(){
        return mApplication;
    }

    @Provides
    @Singleton
    public PostExecutionThread providePostExecutionThread(UiThread uiThread){
        return uiThread;
    }

    @Provides
    @Singleton
    public ThreadExecutor provideThreadExecutor(JobExecutor jobExecutor){
        return jobExecutor;
    }

    @Provides
    @Singleton
    public HealthNewsRepository provideHealthNewsRepo(HealthNewsDataRepository repository){
        return repository;
    }

}

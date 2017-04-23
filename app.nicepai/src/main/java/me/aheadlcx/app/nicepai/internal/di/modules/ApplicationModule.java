package me.aheadlcx.app.nicepai.internal.di.modules;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.aheadlcx.app.nicepai.App;
import me.aheadlcx.app.nicepai.data.executor.JobExecutor;
import me.aheadlcx.app.nicepai.domain.executor.PostExecutionThread;
import me.aheadlcx.app.nicepai.domain.executor.ThreadExecutor;
import me.aheadlcx.app.nicepai.mvp.UIThread;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/23 下午6:54
 */
@Module
public class ApplicationModule {

    private final App mApp;

    public ApplicationModule(App app) {
        mApp = app;
    }

    @Singleton
    @Provides
    Context provideApplicationContext(){
        return this.mApp;
    }

    @Singleton
    @Provides
    public ThreadExecutor provideThreadExecutor(JobExecutor jobExecutor){
        return jobExecutor;
    }

    @Singleton
    @Provides
    public PostExecutionThread providePostExecution(UIThread uiThread){
        return uiThread;
    }


}

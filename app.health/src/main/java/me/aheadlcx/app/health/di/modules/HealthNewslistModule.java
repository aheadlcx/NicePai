package me.aheadlcx.app.health.di.modules;

import dagger.Module;
import dagger.Provides;
import me.aheadlcx.app.health.di.PerActivity;
import me.aheadlcx.app.health.di.Type;
import me.aheadlcx.app.health.domain.interactor.Case;
import me.aheadlcx.app.health.domain.interactor.HealthNewsListCase;
import me.aheadlcx.app.health.ui.health.HealthNewsListPresent;
import me.aheadlcx.app.health.ui.health.HealthNewslistContract;

/**
 * Description:
 * author: aheadlcx
 * Date:2017/1/10 上午10:28
 */
@Module
public class HealthNewslistModule {
    @Type("list")
    @Provides
    @PerActivity
    public Case provideHealthNewsList(HealthNewsListCase healthNewsListCase){
        return healthNewsListCase;
    }

    @PerActivity
    @Provides
    public HealthNewslistContract.Present providePrensent(HealthNewsListPresent present){
        return present;
    }
}

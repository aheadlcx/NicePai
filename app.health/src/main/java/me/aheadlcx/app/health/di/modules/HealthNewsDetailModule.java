package me.aheadlcx.app.health.di.modules;

import dagger.Module;
import dagger.Provides;
import me.aheadlcx.app.health.di.PerActivity;
import me.aheadlcx.app.health.di.Type;
import me.aheadlcx.app.health.domain.interactor.Case;
import me.aheadlcx.app.health.domain.interactor.HealthNewsDetailCase;

/**
 * Description:
 * author: aheadlcx
 * Date:2017/1/10 上午10:27
 */
@Module()
public class HealthNewsDetailModule {

    @Type("detail")
    @Provides
    @PerActivity
    public Case provideHealthNewsDetailCase(HealthNewsDetailCase healthNewsDetailCase){
        return healthNewsDetailCase;
    }
}

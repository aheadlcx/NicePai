package me.aheadlcx.app.health.di.components;

import dagger.Subcomponent;
import me.aheadlcx.app.health.di.PerActivity;
import me.aheadlcx.app.health.di.modules.HealthNewsDetailModule;
import me.aheadlcx.app.health.di.modules.HealthNewsModule;
import me.aheadlcx.app.health.di.modules.HealthNewslistModule;

/**
 * Description:
 * Creator: aheadlcx
 * Date:2016/11/28 上午11:03
 */
//@Component(dependencies = {ApplicationComponent.class}, modules =
//        {ActivityModule.class, HealthNewsModule.class})
@PerActivity
@Subcomponent(modules =
        {HealthNewsModule.class})
public interface HealthNewsComponents{
//    HealthNewsListFragment inject(HealthNewsListFragment healthNewsListFragment);

//    HealthNewsDetailFragment inject(HealthNewsDetailFragment healthNewsDetailFragment);

    HealthNewslistComponents plus (HealthNewslistModule HealthNewslistModule);

    HealthNewsDetailComponents plus(HealthNewsDetailModule HealthNewsDetailModule);
}

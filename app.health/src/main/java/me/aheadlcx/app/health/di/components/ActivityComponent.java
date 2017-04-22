package me.aheadlcx.app.health.di.components;

import dagger.Subcomponent;
import me.aheadlcx.app.health.di.PerActivity;
import me.aheadlcx.app.health.di.modules.ActivityModule;
import me.aheadlcx.app.health.di.modules.HealthNewsModule;

/**
 * Description:
 * Creator: aheadlcx
 * Date:2016/11/28 上午10:46
 */
//@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {
//    Activity activity();
    HealthNewsComponents plus(HealthNewsModule HealthNewsModule);
}
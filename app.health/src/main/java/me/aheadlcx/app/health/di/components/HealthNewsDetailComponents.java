package me.aheadlcx.app.health.di.components;

import dagger.Subcomponent;
import me.aheadlcx.app.health.di.PerActivity;
import me.aheadlcx.app.health.di.modules.HealthNewsDetailModule;
import me.aheadlcx.app.health.ui.health.detail.HealthNewsDetailFragment;

/**
 * Description:
 * author: aheadlcx
 * Date:2017/1/10 上午10:15
 */
@PerActivity
@Subcomponent(modules = HealthNewsDetailModule.class)
public interface HealthNewsDetailComponents {
    HealthNewsDetailFragment inject(HealthNewsDetailFragment healthNewsDetailFragment);
}

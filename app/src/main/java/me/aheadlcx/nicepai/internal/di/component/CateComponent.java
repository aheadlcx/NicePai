package me.aheadlcx.nicepai.internal.di.component;

import dagger.Component;
import me.aheadlcx.nicepai.internal.di.PerActivity;
import me.aheadlcx.nicepai.internal.di.modules.CateModule;
import me.aheadlcx.nicepai.ui.cate.CateFrag;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/23 下午7:59
 */
@Component(dependencies = ApplicationComponent.class, modules = {CateModule.class})
@PerActivity
public interface CateComponent {
    void inject(CateFrag cateFrag);

}

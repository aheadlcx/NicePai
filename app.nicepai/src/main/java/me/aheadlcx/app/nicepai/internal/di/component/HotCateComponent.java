package me.aheadlcx.app.nicepai.internal.di.component;

import dagger.Component;
import me.aheadlcx.app.nicepai.internal.di.PerActivity;
import me.aheadlcx.app.nicepai.internal.di.modules.HoteCateModule;
import me.aheadlcx.app.nicepai.ui.hotcate.HotCateFrag;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/24 下午1:42
 */
@Component(dependencies = ApplicationComponent.class, modules = {HoteCateModule.class})
@PerActivity
public interface HotCateComponent {
    void inject(HotCateFrag hotCateFrag);

}

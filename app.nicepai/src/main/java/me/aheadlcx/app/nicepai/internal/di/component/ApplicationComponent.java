package me.aheadlcx.app.nicepai.internal.di.component;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import me.aheadlcx.app.nicepai.base.BaseActivity;
import me.aheadlcx.app.nicepai.domain.executor.PostExecutionThread;
import me.aheadlcx.app.nicepai.domain.executor.ThreadExecutor;
import me.aheadlcx.app.nicepai.internal.di.modules.ApiModule;
import me.aheadlcx.app.nicepai.internal.di.modules.ApplicationModule;
import me.aheadlcx.app.nicepai.ui.cate.CateService;
import me.aheadlcx.app.nicepai.ui.hotcate.HotCateService;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/23 下午6:51
 */
@Singleton
@Component(modules = { ApplicationModule.class, ApiModule.class})
public interface ApplicationComponent {
    void intect(BaseActivity baseActivity);

    Context context();

    ThreadExecutor threadExecutor();

    PostExecutionThread postExecutionThread();

//    BaseRepository repository();
//    CateRepository getCateRepository();
    CateService getCateService();
    HotCateService getHotCateService();
}

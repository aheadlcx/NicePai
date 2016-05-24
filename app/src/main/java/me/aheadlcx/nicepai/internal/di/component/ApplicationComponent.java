package me.aheadlcx.nicepai.internal.di.component;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import me.aheadlcx.nicepai.base.BaseActivity;
import me.aheadlcx.nicepai.domain.executor.PostExecutionThread;
import me.aheadlcx.nicepai.domain.executor.ThreadExecutor;
import me.aheadlcx.nicepai.internal.di.modules.ApiModule;
import me.aheadlcx.nicepai.internal.di.modules.ApplicationModule;
import me.aheadlcx.nicepai.ui.cate.CateService;
import me.aheadlcx.nicepai.ui.hotcate.HotCateService;

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

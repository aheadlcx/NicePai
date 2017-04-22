package me.aheadlcx.nicepai.internal.di.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.aheadlcx.nicepai.data.net.MyService;
import me.aheadlcx.nicepai.ui.cate.CateService;
import me.aheadlcx.nicepai.ui.hotcate.HotCateService;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/23 下午6:42
 */
@Module
public class ApiModule {

    public ApiModule() {
    }

    //    @PerActivity
    @Singleton
    @Provides
    public CateService getCateService() {
        return createApi(CateService.class);
    }

    private <T> T createApi(Class<T> targetClazz) {
        return MyService.getInstance().createApi(targetClazz);
    }

    @Singleton
    @Provides
    public HotCateService getHotCateService() {
        return createApi(HotCateService.class);
    }
}

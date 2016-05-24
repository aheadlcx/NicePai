package me.aheadlcx.nicepai.internal.di.modules;

import dagger.Module;
import dagger.Provides;
import me.aheadlcx.nicepai.data.repository.HotCateDataRepository;
import me.aheadlcx.nicepai.domain.executor.PostExecutionThread;
import me.aheadlcx.nicepai.domain.executor.ThreadExecutor;
import me.aheadlcx.nicepai.domain.interactor.Case;
import me.aheadlcx.nicepai.domain.interactor.CateCase;
import me.aheadlcx.nicepai.domain.repository.CateRepository;
import me.aheadlcx.nicepai.internal.di.PerActivity;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/24 上午11:34
 */
@Module
public class HoteCateModule {

    String cateId;

    public HoteCateModule(String cateId) {
        this.cateId = cateId;
    }

    public HoteCateModule() {
    }
    @PerActivity
    @Provides
    public Case getCase(CateRepository cateRepository, ThreadExecutor threadExecutor,
                        PostExecutionThread
                                postExecutionThread) {
        return new CateCase(cateId, cateRepository, threadExecutor, postExecutionThread);
    }


    @Provides
    @PerActivity
    public CateRepository provideCateRepository(HotCateDataRepository hotCateDataRepository) {
        return hotCateDataRepository;
    }
}

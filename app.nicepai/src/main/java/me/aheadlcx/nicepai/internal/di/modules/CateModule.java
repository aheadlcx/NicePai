package me.aheadlcx.nicepai.internal.di.modules;

import dagger.Module;
import dagger.Provides;
import me.aheadlcx.nicepai.data.repository.CateDataRepository;
import me.aheadlcx.nicepai.domain.executor.PostExecutionThread;
import me.aheadlcx.nicepai.domain.executor.ThreadExecutor;
import me.aheadlcx.nicepai.domain.interactor.Case;
import me.aheadlcx.nicepai.domain.interactor.CateCase;
import me.aheadlcx.nicepai.domain.repository.CateRepository;
import me.aheadlcx.nicepai.internal.di.PerActivity;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/23 下午8:00
 */
@Module
public class CateModule {

    public CateModule setCateId(String cateId) {
        mCateId = cateId;
        return this;
    }

    public String getCateId() {
        return mCateId;
    }

    private  String mCateId;

    public CateModule(String cateId) {
        mCateId = cateId;
    }

    public CateModule() {
    }

    @PerActivity
    @Provides
    public Case getCase(CateRepository cateRepository, ThreadExecutor threadExecutor,
                        PostExecutionThread
                                postExecutionThread) {
        return new CateCase(mCateId, cateRepository, threadExecutor, postExecutionThread);
    }

    @Provides
    @PerActivity
    public CateRepository provideCateRepository(CateDataRepository cateDataRepository) {
        return cateDataRepository;
    }
}

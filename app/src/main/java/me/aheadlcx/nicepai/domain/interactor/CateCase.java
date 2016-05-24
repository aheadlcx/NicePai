package me.aheadlcx.nicepai.domain.interactor;

import javax.inject.Inject;

import me.aheadlcx.nicepai.domain.executor.PostExecutionThread;
import me.aheadlcx.nicepai.domain.executor.ThreadExecutor;
import me.aheadlcx.nicepai.domain.repository.CateRepository;
import rx.Observable;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/23 下午8:11
 */
public class CateCase extends Case {
    private final String mCateId;
    private final CateRepository mCateRepository;

    @Inject
    public CateCase(String cateId, CateRepository cateRepository, ThreadExecutor threadExecutor,
                       PostExecutionThread
                               postExecutionThread) {
        super(threadExecutor, postExecutionThread);
        mCateId = cateId;
        mCateRepository = cateRepository;
    }

    @Override
    protected Observable buildUseCaseObservable(String page) {
        return mCateRepository.getCates(mCateId, page);
    }
}

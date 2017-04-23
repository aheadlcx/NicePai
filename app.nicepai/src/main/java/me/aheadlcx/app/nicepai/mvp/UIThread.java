package me.aheadlcx.app.nicepai.mvp;

import javax.inject.Inject;
import javax.inject.Singleton;

import me.aheadlcx.app.nicepai.domain.executor.PostExecutionThread;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/23 下午8:20
 */
@Singleton
public class UIThread implements PostExecutionThread {

    @Inject
    public UIThread() {
    }

    @Override
    public Scheduler getScheduler() {
        return AndroidSchedulers.mainThread();
    }
}

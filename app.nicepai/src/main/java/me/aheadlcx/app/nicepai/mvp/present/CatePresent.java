package me.aheadlcx.app.nicepai.mvp.present;

import android.util.Log;

import java.util.List;

import javax.inject.Inject;

import me.aheadlcx.app.nicepai.domain.interactor.Case;
import me.aheadlcx.app.nicepai.domain.interactor.DefaultSubscriber;
import me.aheadlcx.app.nicepai.model.service.response.cate.CateBean;
import me.aheadlcx.app.nicepai.mvp.iui.CateUi;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/23 下午8:09
 */
public class CatePresent {
    private static final String TAG = "CatePresent";
    private final Case mCateCase;
    private CateUi mCateUi;
    private int curPage = 1;

    public void setCateUi(CateUi cateUi) {
        mCateUi = cateUi;
    }

    @Inject
    public CatePresent(Case cateCase) {
        mCateCase = cateCase;
    }

    public void loadData(String cateId) {
        curPage = 1;
        mCateCase.execute(new CateSubscriber());
    }

    public void loadMore() {
        mCateCase.execute(curPage + "", new CateSubscriber());
    }

    private class CateSubscriber extends DefaultSubscriber<List<CateBean>> {

        @Override
        public void onCompleted() {
            curPage++;
            Log.i(TAG, "onCompleted: ");
            super.onCompleted();
        }

        @Override
        public void onError(Throwable e) {
            curPage--;
            if (curPage <= 1) {
                curPage = 1;
            }
            Log.i(TAG, "onError: ");
            super.onError(e);
        }

        @Override
        public void onNext(List<CateBean> list) {
            Log.i(TAG, "onNext: ");
            super.onNext(list);
            mCateUi.fillCate(list);
        }
    }
}

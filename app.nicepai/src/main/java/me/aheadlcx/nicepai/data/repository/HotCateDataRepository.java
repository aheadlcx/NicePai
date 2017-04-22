package me.aheadlcx.nicepai.data.repository;

import java.util.List;

import javax.inject.Inject;

import me.aheadlcx.nicepai.data.utils.CateMapper;
import me.aheadlcx.nicepai.domain.repository.CateRepository;
import me.aheadlcx.nicepai.model.service.response.CateResponse;
import me.aheadlcx.nicepai.model.service.response.cate.CateBean;
import me.aheadlcx.nicepai.ui.hotcate.HotCateService;
import retrofit2.Response;
import rx.Observable;
import rx.functions.Func1;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/24 上午11:37
 */
public class HotCateDataRepository implements CateRepository {
    @Inject
    HotCateService mHotCateService;

    @Inject
    public HotCateDataRepository() {
    }

    @Override
    public Observable<List<CateBean>> getCates(String cateId, String page) {
        return mHotCateService.getCateLists(cateId, page, pagePer).map(new Func1<Response<CateResponse>, List<CateBean>>() {
            @Override
            public List<CateBean> call(Response<CateResponse> cateResponseResponse) {
                return CateMapper.getCateBeen(cateResponseResponse);
            }
        });
    }
}

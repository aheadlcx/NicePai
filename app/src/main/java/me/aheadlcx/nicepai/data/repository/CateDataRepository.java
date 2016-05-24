package me.aheadlcx.nicepai.data.repository;

import java.util.List;

import javax.inject.Inject;

import me.aheadlcx.nicepai.data.utils.CateMapper;
import me.aheadlcx.nicepai.domain.repository.CateRepository;
import me.aheadlcx.nicepai.model.service.response.CateResponse;
import me.aheadlcx.nicepai.model.service.response.cate.CateBean;
import me.aheadlcx.nicepai.ui.cate.CateService;
import retrofit2.Response;
import rx.Observable;
import rx.functions.Func1;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/23 下午5:38
 */
public class CateDataRepository implements CateRepository {
    @Inject
    CateService mCateService;

    @Inject
    public CateDataRepository() {
    }

    @Override
    public Observable<List<CateBean>> getCates(String cateId) {
        return mCateService.getCateLists(cateId, "1", "300").map(new Func1<Response<CateResponse>, List<CateBean>>() {
            @Override
            public List<CateBean> call(Response<CateResponse> cateResponseResponse) {
                return CateMapper.getCateBeen(cateResponseResponse);
            }
        });
    }


}

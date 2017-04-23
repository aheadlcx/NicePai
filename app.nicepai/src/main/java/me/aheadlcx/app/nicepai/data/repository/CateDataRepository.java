package me.aheadlcx.app.nicepai.data.repository;

import java.util.List;

import javax.inject.Inject;

import me.aheadlcx.app.nicepai.data.utils.CateMapper;
import me.aheadlcx.app.nicepai.domain.repository.CateRepository;
import me.aheadlcx.app.nicepai.model.service.response.CateResponse;
import me.aheadlcx.app.nicepai.model.service.response.cate.CateBean;
import me.aheadlcx.app.nicepai.ui.cate.CateService;
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
    public Observable<List<CateBean>> getCates(String cateId, String page) {
        return mCateService.getCateLists(cateId, page, pagePer).map(new Func1<Response<CateResponse>,
                List<CateBean>>() {
            @Override
            public List<CateBean> call(Response<CateResponse> cateResponseResponse) {
                return CateMapper.getCateBeen(cateResponseResponse);
            }
        });
    }


}

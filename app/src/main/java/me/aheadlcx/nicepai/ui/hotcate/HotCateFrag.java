package me.aheadlcx.nicepai.ui.hotcate;

import android.os.Bundle;

import me.aheadlcx.nicepai.model.service.response.CateResponse;
import me.aheadlcx.nicepai.ui.cate.CateFrag;
import retrofit2.Response;
import rx.Observable;

/**
 * Description:
 * Creator: ZhangJinWei
 * Date:16/3/3 下午3:27
 */
public class HotCateFrag extends CateFrag {

    @Override
    public Observable<Response<CateResponse>> getDataObserable(String cateId) {
        HotCateService hotCateService = getRetrofit().create(HotCateService.class);
        Observable<Response<CateResponse>> cateLists = hotCateService.getCateLists(cateId, "1", "300");
        return cateLists;
    }

    public static HotCateFrag getInstance(Bundle bundle) {
        HotCateFrag frag = new HotCateFrag();
        frag.setArguments(bundle);
        return frag;
    }

}

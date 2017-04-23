package me.aheadlcx.app.nicepai.ui.hotcate;

import android.os.Bundle;

import me.aheadlcx.app.nicepai.App;
import me.aheadlcx.app.nicepai.internal.di.component.DaggerHotCateComponent;
import me.aheadlcx.app.nicepai.internal.di.component.HotCateComponent;
import me.aheadlcx.app.nicepai.internal.di.modules.HoteCateModule;
import me.aheadlcx.app.nicepai.model.service.response.CateResponse;
import me.aheadlcx.app.nicepai.ui.cate.CateFrag;
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

    HoteCateModule mHoteCateModule;
    HotCateComponent mHotCateComponent;

    public static HotCateFrag getInstance(Bundle bundle) {
        HotCateFrag frag = new HotCateFrag();
        frag.setArguments(bundle);
        return frag;
    }

    @Override
    public void initCateId() {
        mHoteCateModule = new HoteCateModule(mCateBaseInfo.getCategoryId() + "");
    }

    @Override
    public void initInject() {
//        mCateComponent = DaggerCateComponent.builder().applicationComponent(App.getApp().getApplicationComponent())
//                .cateModule(mCateModule).build();

        mHotCateComponent = DaggerHotCateComponent.builder().applicationComponent(App.getApp()
                .getApplicationComponent()).hoteCateModule(mHoteCateModule).build();
        mHotCateComponent.inject(this);
        mPresent.setCateUi(this);
    }
}

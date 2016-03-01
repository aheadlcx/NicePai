package me.aheadlcx.nicepai.cate;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import me.aheadlcx.nicepai.R;
import me.aheadlcx.nicepai.base.BaseFragment;
import me.aheadlcx.nicepai.model.service.response.CateResponse;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Description:
 * Creator: ZhangJinWei
 * Date:16/2/29 下午8:10
 */
public class GoddessFrag extends BaseFragment {
    private static final String TAG = "GoddessFrag";
    private android.widget.TextView txtContent;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_cate, null);
        initViews(view);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    private void initData() {
        CateService cateService = getRetrofit().create(CateService.class);
        Observable<List<CateResponse.CateBean>> cateLists = cateService.getCateLists("134", "1",
                "1");
        cateLists.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<List<CateResponse.CateBean>>() {
                    @Override
                    public void onCompleted() {
                        Log.e(TAG, "onCompleted: ");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, "onError: ",e );
                        txtContent.setText(e.toString());
                    }

                    @Override
                    public void onNext(List<CateResponse.CateBean> cateBeen) {
                        Log.e(TAG, "onNext: ss", null);
                        txtContent.setText(cateBeen.get(0).toString());
                    }
                });
    }

    private void initViews(View view) {
        this.txtContent = (TextView) view.findViewById(R.id.txtContent);

    }
}

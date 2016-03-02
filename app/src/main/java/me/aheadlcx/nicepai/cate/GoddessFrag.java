package me.aheadlcx.nicepai.cate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import me.aheadlcx.nicepai.R;
import me.aheadlcx.nicepai.base.BaseFragment;
import me.aheadlcx.nicepai.databinding.FragCateBinding;
import me.aheadlcx.nicepai.model.service.response.cate.CateBean;
import me.aheadlcx.nicepai.model.service.response.CateResponse;
import me.aheadlcx.nicepai.ui.CateDetailAct;
import retrofit2.Response;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Description:
 * Creator: ZhangJinWei
 * Date:16/2/29 下午8:10
 */
public class GoddessFrag extends BaseFragment {
    private static final String TAG = "GoddessFrag";
    private android.widget.TextView txtContent;
    FragCateBinding mBinding;
    RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewDataBinding binding = DataBindingUtil.inflate(inflater, R.layout.frag_cate, null, false);
        initViews(binding.getRoot());
        mBinding = (FragCateBinding) binding;
        return binding.getRoot();
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    private void initData() {
        CateService cateService = getRetrofit().create(CateService.class);
        Observable<Response<CateResponse>> cateLists = cateService.getCateLists("134", "1",
                "300");
        Subscription subscribe = cateLists
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .map(new Func1<Response<CateResponse>, List<CateBean>>() {
                    @Override
                    public List<CateBean> call(Response<CateResponse> cateResponseResponse) {
                        CateResponse body = cateResponseResponse.body();
                        List<CateBean> result = body.getResult();
                        List<CateBean> mp4Result = new ArrayList<CateBean>();
                        int size = result.size();
                        for (int i = 0; i < size; i++) {
                            CateBean cateBean = result.get(i);
                            if (cateBean.getChannel() != null && cateBean.getChannel().getStream
                                    () != null && !TextUtils.isEmpty(cateBean.getChannel()
                                    .getStream().getAnd()) && cateBean.getChannel().getStream()
                                    .getAnd().equals("mp4")){
                                mp4Result.add(cateBean);
                            }
                        }
                        return mp4Result;
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<List<CateBean>>() {
                    @Override
                    public void onCompleted() {
                        Log.e(TAG, "onCompleted: ");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, "onError: ", e);
                        txtContent.setText(e.toString());
                    }

                    @Override
                    public void onNext(List<CateBean> cateBeens) {
                        Log.e(TAG, "onNext: ss", null);
                        mBinding.txtContent.setText("map success" + cateBeens.size());
                        CateAdapter adapter = new CateAdapter(cateBeens);
                        mRecyclerView.setAdapter(adapter);
                        adapter.setCallBack(new CateAdapter.OnItemClickCallBack() {
                            @Override
                            public void onItemClick(CateBean cateBean) {
                                Intent intent = new Intent(getActivity(), CateDetailAct.class);
                                intent.putExtra("videoUrl", cateBean.getChannel().getStream()
                                        .getBase() + cateBean.getChannel().getStream().getAnd());
                                getActivity().startActivity(intent);
                            }
                        });
                    }
                });
        addSubscription(subscribe);
    }

    private void initViews(View view) {
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycleView);
        this.txtContent = (TextView) view.findViewById(R.id.txtContent);

        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });
    }
}

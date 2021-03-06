package me.aheadlcx.nicepai.ui.cate;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
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

import fr.castorflex.android.circularprogressbar.CircularProgressBar;
import me.aheadlcx.nicepai.R;
import me.aheadlcx.nicepai.base.BaseFragment;
import me.aheadlcx.nicepai.databinding.FragCateBinding;
import me.aheadlcx.nicepai.model.service.response.CateResponse;
import me.aheadlcx.nicepai.model.service.response.cate.CateBean;
import me.aheadlcx.nicepai.model.service.response.catelist.CateBaseInfo;
import me.aheadlcx.nicepai.ui.CateDetailAct;
import me.aheadlcx.nicepai.widget.RecycleViewAutoScrollHelper;
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
public class CateFrag extends BaseFragment {
    private static final String TAG = "CateFrag";
    private android.widget.TextView txtContent;
    FragCateBinding mBinding;
    RecyclerView mRecyclerView;
    CateBaseInfo mCateBaseInfo;
    CircularProgressBar progressBar;
    View progressbarParent;
    Response<CateResponse> lastResponse;
    SwipeRefreshLayout swipeRefreshLayout;
    CateAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView: ");
        if (mBinding != null) {
            return mBinding.getRoot();
        }
        ViewDataBinding binding = DataBindingUtil.inflate(inflater, R.layout.frag_cate, null, false);
        initViews(binding.getRoot());
        mBinding = (FragCateBinding) binding;
        return binding.getRoot();
    }

    public static CateFrag getInstance(Bundle bundle) {
        CateFrag frag = new CateFrag();
        frag.setArguments(bundle);
        return frag;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String categoryName = "";
        if (mCateBaseInfo != null) {
            categoryName = mCateBaseInfo.getCategoryName();
        }
        Log.i(TAG, "onActivityCreated: name --" + categoryName);
        Bundle bundle = getArguments();
        if (bundle != null) {
            CateBaseInfo cateBaseInfo = (CateBaseInfo) bundle.getSerializable("cateBaseInfo");
            if (cateBaseInfo != null) {
                mCateBaseInfo = cateBaseInfo;
                if (lastResponse != null) {
                    return;
                }
                initData();
            }
        }
    }

    private void initData() {
        String cateId = mCateBaseInfo.getCategoryId() + "";
        if (TextUtils.isEmpty(cateId)) {
            cateId = "134";
        }
        Observable<Response<CateResponse>> cateLists = getDataObserable(cateId);
        Subscription subscribe = cateLists
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .map(new Func1<Response<CateResponse>, List<CateBean>>() {
                    @Override
                    public List<CateBean> call(Response<CateResponse> cateResponseResponse) {
                        lastResponse = cateResponseResponse;
                        CateResponse body = cateResponseResponse.body();
                        if (body == null) {
                            return null;
                        }
                        List<CateBean> result = body.getResult();
                        if (result == null) {
                            return null;
                        }
                        List<CateBean> mp4Result = new ArrayList<CateBean>();
                        int size = result.size();
                        for (int i = 0; i < size; i++) {
                            CateBean cateBean = result.get(i);
                            if (cateBean.getChannel() != null && cateBean.getChannel().getStream
                                    () != null && !TextUtils.isEmpty(cateBean.getChannel()
                                    .getStream().getAnd()) && cateBean.getChannel().getStream()
                                    .getAnd().equals("mp4")) {
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
                        progressBar.setVisibility(View.GONE);
                        progressbarParent.setVisibility(View.GONE);
                        swipeRefreshLayout.setRefreshing(false);
                        Log.e(TAG, "onError: ", e);
                        txtContent.setText(e.toString());
                    }

                    @Override
                    public void onNext(List<CateBean> cateBeens) {
                        Log.e(TAG, "onNext: ss");
                        swipeRefreshLayout.setRefreshing(false);
                        progressBar.setVisibility(View.GONE);
                        progressbarParent.setVisibility(View.GONE);
                        if (cateBeens == null) {
                            mBinding.txtContent.setText("cateBeans size == 0");
                            return;
                        }
                        mBinding.txtContent.setText("map success" + cateBeens.size());
                        fillData(cateBeens);
                    }
                });
        addSubscription(subscribe);
    }

    public Observable<Response<CateResponse>> getDataObserable(String cateId) {
        CateService cateService = getRetrofit().create(CateService.class);
        return cateService.getCateLists(cateId, "1",
                "300");
    }

    private void fillData(List<CateBean> cateBeens) {

        if (null == adapter) {
            adapter = new CateAdapter(cateBeens);
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
        }else {
            adapter.setLists(cateBeens);
        }

    }

    private void onRefreshData() {
        lastResponse = null;
        swipeRefreshLayout.setRefreshing(true);
        initData();
    }

    private void initViews(View view) {
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycleView);
        this.txtContent = (TextView) view.findViewById(R.id.txtContent);
        progressBar = (CircularProgressBar) view.findViewById(R.id.progress_bar);
        progressbarParent = view.findViewById(R.id.progressbarParent);
        swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipeRefreshLayout);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                onRefreshData();
            }
        });


        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,
                StaggeredGridLayoutManager.VERTICAL));
        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });

        RecycleViewAutoScrollHelper scrollHelper = new RecycleViewAutoScrollHelper(mRecyclerView);
        scrollHelper.setEnabled(true);
        mRecyclerView.setOnTouchListener(scrollHelper);
    }
}

package me.aheadlcx.nicepai.ui.catelist;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import java.util.List;

import me.aheadlcx.nicepai.R;
import me.aheadlcx.nicepai.base.BaseActivity;
import me.aheadlcx.nicepai.model.service.response.catelist.CateBaseInfo;
import me.aheadlcx.nicepai.model.service.response.catelist.CateListResponse;
import me.aheadlcx.nicepai.ui.cate.CateFrag;
import me.aheadlcx.nicepai.ui.hotcate.HotCateFrag;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Description:
 * Creator: ZhangJinWei
 * Date:16/3/2 下午6:21
 */
public class CateMainAct extends BaseActivity {
    private static final String TAG = "CateMainAct";
    private Toolbar toolbar;
    private TabLayout tabs;
    private AppBarLayout appbar;
    private ViewPager viewpager;
    private CoordinatorLayout maincontent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frag_all_cate);
        this.maincontent = (CoordinatorLayout) findViewById(R.id.main_content);
        this.viewpager = (ViewPager) findViewById(R.id.viewpager);
        this.appbar = (AppBarLayout) findViewById(R.id.appbar);
        this.tabs = (TabLayout) findViewById(R.id.tabs);
        this.toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("NicePP");

        initData();
    }

    private void initData() {
        CateListService cateListService = getRetrofit().create(CateListService.class);
        Observable<CateListResponse> cateList = cateListService.getCateList();
        Subscription subscribe = cateList
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(new Func1<CateListResponse, List<CateBaseInfo>>() {
                    @Override
                    public List<CateBaseInfo> call(CateListResponse cateListResponse) {
                        if (cateListResponse.getResult() != null) {
                            return cateListResponse.getResult();
                        }
                        return null;
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<List<CateBaseInfo>>() {
                    @Override
                    public void onCompleted() {
                        Log.i(TAG, "onCompleted: ");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i(TAG, "onError: " + e.toString() + " --- message --" + e.getMessage());
                    }

                    @Override
                    public void onNext(List<CateBaseInfo> cateBaseInfos) {
                        Log.i(TAG, "onNext: ");
                        if (cateBaseInfos == null) {
                            return;
                        }
                        setupViewPager(cateBaseInfos);
                    }
                });
        addSubscription(subscribe);
    }

    private void setupViewPager(@NonNull List<CateBaseInfo> cateBaseInfos) {
        Adapter adapter = new Adapter(getSupportFragmentManager(), cateBaseInfos);
        viewpager.setAdapter(adapter);
        tabs.setupWithViewPager(viewpager);
        tabs.setTabMode(TabLayout.MODE_SCROLLABLE);
    }

    public class Adapter extends FragmentPagerAdapter {
        List<CateBaseInfo> lists;

        public Adapter(FragmentManager fm, List<CateBaseInfo> lists) {
            super(fm);
            this.lists = lists;
        }

        @Override
        public Fragment getItem(int position) {
            Bundle bundle = new Bundle();
            CateBaseInfo cateBaseInfo = lists.get(position);
            bundle.putSerializable("cateBaseInfo", cateBaseInfo);
            Fragment instance;
            if (cateBaseInfo.getCategoryName() != null && cateBaseInfo.getCategoryName().equals
                    ("热门")) {
                instance = HotCateFrag.getInstance(bundle);

            } else {
                instance = CateFrag.getInstance(bundle);

            }
            return instance;
        }

        @Override
        public int getCount() {
            if (lists == null) {
                return 0;
            }
            return lists.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return lists.get(position).getCategoryName();
        }
    }
}

package me.aheadlcx.nicepai.widget;

import android.support.v4.widget.AutoScrollHelper;
import android.support.v7.widget.RecyclerView;

/**
 * Description:
 * Creator: ZhangJinWei
 * Date:16/4/20 下午2:15
 */
public class RecycleViewAutoScrollHelper extends AutoScrollHelper {
    RecyclerView mRecyclerView;

    public RecycleViewAutoScrollHelper( RecyclerView recyclerView) {
        super(recyclerView);
        mRecyclerView = recyclerView;
        setEdgeType(EDGE_TYPE_INSIDE);
        setExclusive(true);
    }

    @Override
    public void scrollTargetBy(int deltaX, int deltaY) {
        mRecyclerView.scrollBy(deltaX, deltaY);
    }

    @Override
    public boolean canTargetScrollHorizontally(int direction) {
        if (null != mRecyclerView.getLayoutManager()) {
            return mRecyclerView.getLayoutManager().canScrollHorizontally();
        }
        return false;
    }

    @Override
    public boolean canTargetScrollVertically(int direction) {
        if (null != mRecyclerView.getLayoutManager()){
            return mRecyclerView.getLayoutManager().canScrollVertically();
        }
        return false;
    }
}

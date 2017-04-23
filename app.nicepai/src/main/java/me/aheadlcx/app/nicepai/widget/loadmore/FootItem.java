package me.aheadlcx.app.nicepai.widget.loadmore;

import android.view.View;
import android.view.ViewGroup;

public abstract class FootItem {
    public CharSequence endText;
    public CharSequence loadingText;
    public CharSequence pullToLoadText;

    public abstract void onBindData(View view, int i);

    public abstract View onCreateView(ViewGroup viewGroup);
}

package me.aheadlcx.nicepai.widget.loadmore;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.morecruit.uikit.R;

public class DefaultFootItem extends FootItem {
    private static final String TAG = "DefaultFootItem";
    private TextView mEndTextView;
    private TextView mLoadingText;
    private ProgressBar mProgressBar;
    private TextView mPullToLoadText;

    public View onCreateView(ViewGroup parent) {
        View view = ((LayoutInflater) parent.getContext().getSystemService("layout_inflater")).inflate(R.layout.rv_with_footer_loading, parent, false);
        this.mProgressBar = (ProgressBar) view.findViewById(R.id.rv_with_footer_loading_progress);
        this.mEndTextView = (TextView) view.findViewById(R.id.rv_with_footer_loading_end);
        this.mLoadingText = (TextView) view.findViewById(R.id.rv_with_footer_loading_load);
        this.mPullToLoadText = (TextView) view.findViewById(R.id.rv_with_footer_loading_pull_to_load);
        return view;
    }

    public void onBindData(View view, int state) {
        if (state == 1) {
            if (TextUtils.isEmpty(this.loadingText)) {
                showProgressBar(view.getContext().getResources().getString(R.string.rv_with_footer_loading));
            } else {
                showProgressBar(this.loadingText);
            }
        } else if (state == 0) {
            if (TextUtils.isEmpty(this.endText)) {
                showPullToLoad(view.getContext().getResources().getString(R.string.rv_with_footer_empty));
            } else {
                showPullToLoad(this.endText);
            }
        } else if (state != 4) {
        } else {
            if (TextUtils.isEmpty(this.pullToLoadText)) {
                showPullToLoad(view.getContext().getResources().getString(R.string.rv_with_footer_pull_load_more));
            } else {
                showPullToLoad(this.pullToLoadText);
            }
        }
    }

    public void showPullToLoad(CharSequence message) {
        this.mPullToLoadText.setVisibility(0);
        this.mEndTextView.setVisibility(8);
        this.mProgressBar.setVisibility(8);
        this.mLoadingText.setVisibility(8);
        if (!TextUtils.isEmpty(message)) {
            this.mPullToLoadText.setText(message);
        }
    }

    public void showProgressBar(CharSequence load) {
        this.mEndTextView.setVisibility(8);
        this.mProgressBar.setVisibility(0);
        this.mPullToLoadText.setVisibility(8);
        if (TextUtils.isEmpty(load)) {
            this.mLoadingText.setVisibility(8);
            return;
        }
        this.mLoadingText.setVisibility(0);
        this.mLoadingText.setText(load);
    }

    public void showEnd(CharSequence end) {
        this.mEndTextView.setVisibility(0);
        this.mPullToLoadText.setVisibility(8);
        this.mProgressBar.setVisibility(8);
        this.mLoadingText.setVisibility(8);
        if (!TextUtils.isEmpty(end)) {
            this.mEndTextView.setText(end);
        }
    }
}

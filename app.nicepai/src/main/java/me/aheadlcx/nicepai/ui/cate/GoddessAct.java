package me.aheadlcx.nicepai.ui.cate;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Window;

import me.aheadlcx.nicepai.base.BaseActivity;

/**
 * Description:
 * Creator: ZhangJinWei
 * Date:16/2/29 下午8:10
 */
public class GoddessAct extends BaseActivity {

    private static final String TAG = "GoddessAct";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction().add(Window.ID_ANDROID_CONTENT, new CateFrag(), TAG)
                .commit();
    }
}

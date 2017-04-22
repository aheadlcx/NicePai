package me.aheadlcx.app.health.ui.health.detail;

import android.os.Bundle;
import android.support.annotation.Nullable;

import me.aheadlcx.app.health.base.BaseActivity;
import me.aheadlcx.app.health.constant.HealthType;
import me.aheadlcx.app.health.constant.IntentKey;

/**
 * Description:
 * Creator: aheadlcx
 * Date:2016/11/29 下午8:05
 */

public class HealthNewsDetailActivity extends BaseActivity {
    private static final String TAG = "HealthNewsDetailActivit";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HealthNewsDetailFragment fragment = new
                HealthNewsDetailFragment();
        int healthType = getIntent().getIntExtra(IntentKey.HEALTH_TYPE, HealthType.TYPE_INFO);
        fragment.setHealthType(healthType);
        getSupportFragmentManager().beginTransaction().add(android.R.id.content, fragment).commit();
    }
}

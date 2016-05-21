package me.aheadlcx.nicepai.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;

import me.aheadlcx.nicepai.R;
import me.aheadlcx.nicepai.base.BaseActivity;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/21 上午11:37
 */
public class TestDaggerAct extends BaseActivity {

    @Inject
    TestDagger mTestDagger;
    TextView txtShow;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_test);
        txtShow = (TextView) findViewById(R.id.txtShow);
        txtShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTestDagger.show();
            }
        });
    }
}

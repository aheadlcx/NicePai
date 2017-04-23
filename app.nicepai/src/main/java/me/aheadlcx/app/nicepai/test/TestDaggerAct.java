package me.aheadlcx.app.nicepai.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;

import me.aheadlcx.nicepai.R;
import me.aheadlcx.app.nicepai.base.BaseActivity;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/21 上午11:37
 */
public class TestDaggerAct extends BaseActivity {

    @Inject
    TestDagger mTestDagger;
    TextView txtShow;
    TextView txtShow2;
    TextView txtShow3;

    @Inject
    @Type("big")
    TestQualifier mTestQualifier;

    @Inject
    @Type("small")
    TestQualifier mTestQualifier2;
    TestDaggerActComponent mTestDaggerActComponent;

    TestDaggerActComponent2 mTestDaggerActComponent2;

    @Inject
    @Type("old")
    TestQualifier mTestQualifier3;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_test);

        mTestDaggerActComponent = DaggerTestDaggerActComponent.builder().testDaggerModule(new TestDaggerModule())
                .build();
        mTestDaggerActComponent.inject(this);

        txtShow = (TextView) findViewById(R.id.txtShow);
        txtShow2 = (TextView) findViewById(R.id.txtShow2);
        txtShow3 = (TextView) findViewById(R.id.txtShow3);

        txtShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTestDagger.show();
            }
        });

        txtShow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTestQualifier.show();
            }
        });

        txtShow3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTestQualifier2.show();
            }
        });
    }
}

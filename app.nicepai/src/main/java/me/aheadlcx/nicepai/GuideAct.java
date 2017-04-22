package me.aheadlcx.nicepai;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import me.aheadlcx.nicepai.base.BaseActivity;
import me.aheadlcx.nicepai.ui.catelist.CateMainAct;

/**
 * Description:
 * author: aheadlcx
 * Date:2017/3/22 下午9:31
 */

public class GuideAct extends BaseActivity {

    private android.widget.TextView txtGuide;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_guide);
        this.txtGuide = (TextView) findViewById(R.id.txtGuide);
        txtGuide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuideAct.this, CateMainAct.class);
                GuideAct.this.startActivity(intent);
            }
        });
    }
}

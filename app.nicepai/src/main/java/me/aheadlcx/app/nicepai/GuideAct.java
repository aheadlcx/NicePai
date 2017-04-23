package me.aheadlcx.app.nicepai;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import me.aheadlcx.app.nicepai.base.BaseActivity;
import me.aheadlcx.nicepai.R;
import me.aheadlcx.app.nicepai.ui.catelist.CateMainAct;

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
        findViewById(R.id.txtHealth).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoHealth();
            }
        });
    }

    private void gotoHealth(){
        Intent intent = new Intent(this, me.aheadlcx.app.health.test.GuideAct.class);
        this.startActivity(intent);
    }
}

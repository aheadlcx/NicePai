package me.aheadlcx.nicepai.test;

import android.util.Log;

import javax.inject.Inject;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/21 上午11:38
 */
public class TestDagger {

    private static final String TAG = "TestDagger";
    private int  level;
    @Inject
    public TestDagger() {
        level = 1;
    }

    public void show(){
        //from inden
        //from test
        //from test just add
        Log.i(TAG, "show: ");
        Log.e(TAG, "show: ");
        //change from test
        //bb from inden
        //aa from test
        //bb from test 1
        //bb from test 2
        //bb from test 3
        //bb from test 4
        //cc from inden cherry pick
        //dd from test pick
    }
}

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
    @Inject
    public TestDagger() {
    }

    public void show(){
        Log.i(TAG, "show: ");
    }
}

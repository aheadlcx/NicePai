package me.aheadlcx.app.nicepai.test;

import android.util.Log;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/21 下午3:04
 */
public class TestQualifier {
    public String name;

    private static final String TAG = "TestQualifier";

    public TestQualifier(String name) {
        this.name = name;
    }

    public void show() {
        Log.e(TAG, "show: " + name);
    }
}

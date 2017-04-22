package me.aheadlcx.health.di.test;

import javax.inject.Inject;

/**
 * Description:
 * Creator: aheadlcx
 * Date:2016/11/28 下午5:52
 */
//@Singleton
public class TestDiImpl implements TestDi {
    String name;
    @Inject
    public TestDiImpl() {
    }
}

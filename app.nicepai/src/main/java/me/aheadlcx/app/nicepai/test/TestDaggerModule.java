package me.aheadlcx.app.nicepai.test;

import dagger.Module;
import dagger.Provides;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/21 下午3:01
 */
@Module
public class TestDaggerModule {

    public TestDaggerModule() {
    }

    @Provides
    @Type("big")
    public TestQualifier getBig() {
        return new TestQualifier("big");
    }

    @Provides
    @Type("small")
    public TestQualifier getSmall() {
        return new TestQualifier("small");
    }

    @Provides
    @Type("old")
    public TestQualifier getOld() {
        return new TestQualifier("old");
    }
}

package me.aheadlcx.nicepai.test;

import dagger.Module;
import dagger.Provides;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/23 下午2:26
 */
@Module
public class TestDaggerModule2 {

    @Provides
    public TestQualifier getNewTQ(){
        return new TestQualifier("new");
    }

    public TestDaggerModule2() {
    }
}

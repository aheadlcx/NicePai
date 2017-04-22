package me.aheadlcx.app.health.di.modules;

import dagger.Module;
import dagger.Provides;
import me.aheadlcx.app.health.di.test.TestDi;
import me.aheadlcx.app.health.di.test.TestDiImpl;

/**
 * Description:
 * Creator: aheadlcx
 * Date:2016/11/28 下午2:43
 */

@Module
public class TestModule {
    public TestModule() {
    }

//    @Singleton
    @Provides
    public TestDi getTestDi(TestDiImpl testDiImpl) {
        return testDiImpl;
    }
}

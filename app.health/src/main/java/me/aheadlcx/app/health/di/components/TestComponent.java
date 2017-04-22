package me.aheadlcx.app.health.di.components;

import javax.inject.Singleton;

import dagger.Component;
import me.aheadlcx.app.health.di.modules.TestModule;
import me.aheadlcx.app.health.di.test.TestDi;

/**
 * Description:
 * Creator: aheadlcx
 * Date:2016/11/28 下午2:42
 */
@Singleton
@Component(modules = TestModule.class)
public interface TestComponent {
    TestDi getDTestDi();
//modules = TestModule.class
}

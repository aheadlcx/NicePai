package me.aheadlcx.nicepai.test;

import dagger.Component;
import me.aheadlcx.nicepai.MainActivity;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/21 上午11:42
 */
@Component(modules = TestDaggerModule.class)
public interface TestDaggerActComponent {
    void inject(TestDaggerAct testDaggerAct);
    void inject(MainActivity mainActivity);
}

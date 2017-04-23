package me.aheadlcx.app.nicepai.test;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Description:
 * Creator: aheadlcx
 * Date:16/5/21 下午2:57
 */
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Type {
    String value() default "";
}

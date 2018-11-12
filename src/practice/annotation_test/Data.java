package practice.annotation_test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * created by tianfeng on 2018/11/12
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface Data {
    
}

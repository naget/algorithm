package practice.annotation_test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * created by tianfeng on 2018/11/12
 */
@Retention(RetentionPolicy.RUNTIME)//如果改成.CLASS，注解在运行期机会被丢弃
@Target(ElementType.TYPE)
public @interface Data {
    public String id();
    public String description() default "no description";
}

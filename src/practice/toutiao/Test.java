package practice.toutiao;

import java.lang.reflect.Method;

/**
 * Created by tianfeng on 2018/4/15.
 */
public class Test {
    public static void main(String[] args) {
//        System.out.println(".class方式");
//        Class<ReflectTest> c = ReflectTest.class;
        System.out.println("Class.forName()方式");
        try {
            Class<?> CC = Class.forName("practice.ReflectTest");
            Method[] methods = CC.getMethods();
            for (Method m :
                    methods) {
                System.out.println(m);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

//        System.out.println("对象名.getClass()方法");
//        ReflectTest r  = new ReflectTest();
//        System.out.println("-------------------------");
//        Class<?> ccc = r.getClass();

    }
}

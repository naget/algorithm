package practice.test;

import practice.A;

/**
 * created by tianfeng on 2018/10/5
 */
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        Demo.class.getClassLoader().loadClass("algorithm.src.practice.test.Test.class");
        System.out.println(Demo.class.getClassLoader().toString());
    }
}

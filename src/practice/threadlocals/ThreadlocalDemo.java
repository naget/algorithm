package practice.threadlocals;
import practice.unSafeDemo.UnsafeDemo;

import java.text.SimpleDateFormat;

/**
 * created by tianfeng on 2018/10/14
 */
public class ThreadlocalDemo {
     static ThreadLocal<SimpleDateFormat> local = new ThreadLocal<SimpleDateFormat>(){
        @Override
        protected SimpleDateFormat initialValue() {
            System.out.println("Thread:"+Thread.currentThread().getName());
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    };
    public static void main(String[] args) throws Exception {
        local.set(new SimpleDateFormat());
        SimpleDateFormat sdf = local.get();
        System.out.println(local.get());
        Thread thread = new Thread(){
            @Override
            public void run() {
                local.set(new SimpleDateFormat());
                SimpleDateFormat sdf = local.get();
                System.out.println(local.get());
            }
        };
        thread.start();
        thread.join();

    }


}

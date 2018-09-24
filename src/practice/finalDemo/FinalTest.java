package practice.finalDemo;

import java.util.concurrent.CountDownLatch;

/**
 * created by tianfeng on 2018/6/20
 */
public  class FinalTest {
    final int a;
    int b;
    static boolean flag=true;
    static FinalTest instance;
    final static CountDownLatch startGate = new CountDownLatch(1);
    private FinalTest(){
        a=1;
        b=2;
    }
    public static void init(){
       instance = new FinalTest();
    }
    public static void print(){
        FinalTest finalTest = instance;
        if (finalTest!=null)
        System.out.println("a="+finalTest.a+" "+"b="+finalTest.b);
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
           new Thread(new Runnable() {
               @Override
               public void run() {
                   try {
                       FinalTest.startGate.await();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   FinalTest.print();
               }
           }).start();
        }
        startGate.countDown();
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        init();
    }
}

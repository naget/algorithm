package practice;

/**
 * Created by tianfeng on 2018/3/10.
 */
public class A extends Thread {
    public void run(){
        System.out.println("i am A");
    }

    public static void main(String[] args) {
        A a = new A();
        a.start();
    }
}

package practice;

/**
 * Created by tianfeng on 2018/3/10.
 */
public class B implements Runnable {
    @Override
    public void run() {
        System.out.println("i am b");
    }

    public static void main(String[] args) {
        Thread b = new Thread(new B());
        b.start();
    }
}

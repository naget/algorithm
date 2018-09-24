package practice;

/**
 * Created by tianfeng on 2018/3/10.
 */
public class ErrorDemo implements Runnable{
    private static volatile int t=0;
    @Override
    public void run() {

            t++;
            System.out.println(t);
    }
    public int getT(){
        return t;
    }

    public static void main(String[] args) {
        ErrorDemo e = new ErrorDemo();
        for (int i = 0;i<10000;i++){
            Thread t = new Thread(e);
            t.start();
        }

    }
}

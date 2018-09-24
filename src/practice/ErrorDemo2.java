package practice;

/**
 * Created by tianfeng on 2018/3/10.
 */
public class ErrorDemo2 implements Runnable {
    private static boolean flag = false;
    @Override
    public void run() {
        if (flag){
                System.out.println();
        }
    }
    public void write(){
        flag = true;
    }
}

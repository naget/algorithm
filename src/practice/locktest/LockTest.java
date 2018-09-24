package practice.locktest;

/**
 * created by tianfeng on 2018/6/17
 */
public class LockTest {
    static int count;
    public  synchronized void InstanceAdd(){
        count++;
    }
    public static synchronized void staticAdd(){
    count++;}
    public void add(){
        count++;
    }
    public  void  blockAdd(){
        synchronized (this){
            count++;
        }
    }

    public static void main(String[] args) {
        LockTest lockTest1 = new LockTest();
        LockTest lockTest2 = new LockTest();
           Thread thread1= new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=0;i<1000;i++){
                        lockTest1.staticAdd();
//                        lockTest1.InstanceAdd();
//                        lockTest1.blockAdd();
                    }
                }
            });
            Thread thread2=new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=0;i<1000;i++){
                        lockTest1.add();
//                        lockTest2.blockAdd();
//                        lockTest2.InstanceAdd();
                    }

                }
            });
            thread1.start();
            thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("count="+count);
    }
}

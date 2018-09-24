package practice;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by tianfeng on 2018/4/14.
 */
public class LockDebug {

    public static void main(String[] args) {
        Thread t;
        Task task  = new Task();
        for (int i =0;i<1000;i++){
            t = new Thread(task);
            t.start();
        }
    }
    static class Task implements Runnable{
        ReentrantLock lock = new ReentrantLock();
        public  int i;
        @Override
        public void run() {
            add();
            if (i%10==0) System.out.println(i);
        }
        private synchronized void add(){
            this.i++;
        }
        private void lockadd(){
            lock.lock();
            this.i++;
            lock.unlock();
        }

    }
}

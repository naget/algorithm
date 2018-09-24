package practice;

/**
 * Created by tianfeng on 2018/1/18.
 */
public class Npp {
    public static void main(String[] args) {
        int N = 0;
        int[] a = new int[5];
        a[++N] = 2;
        for (int i = 0;i<5;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        System.out.println("N="+N);
        System.out.println("a[N--]="+a[N--]);
        System.out.println("N="+N);
    }
}

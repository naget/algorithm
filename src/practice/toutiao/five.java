package practice.toutiao;

import java.util.Scanner;

/**
 * Created by tianfeng on 2018/4/15.
 */
public class five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int[] c = new int[N];
        for (int i = 0;i<N;i++){
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            c[i] = scanner.nextInt();
        }
        for (int i = 0;i<N;i++){
            if (c[i]>b[i]&&c[i]>a[i]){
                System.out.println(0);
                continue;
            }

        }
    }
}

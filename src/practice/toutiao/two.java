package practice.toutiao;

import java.util.Scanner;

/**
 * Created by tianfeng on 2018/4/15.
 */
public class two {
    public static int n1;
    public static int n2;
    public static int[] n1s;
    public static int[] n2s;
    public static int m;
    public static long number;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         n1 = scanner.nextInt();
        n1s = new int[n1];
         n2 = scanner.nextInt();
         n2s = new int[n2];
        m = scanner.nextInt();
        int n1cap=0;
        int n2cap = 0;
        number = 0;//总数
        for (int i = 0;i<n1;i++){
            n1s[i] = scanner.nextInt();
            if (m>n1s[i])n1cap = i;
        }
        for (int j = 0;j<n2;j++){
            n2s[j] = scanner.nextInt();
            if (m>n2s[j])n2cap = j;
        }
        for (int i = 0;i<n1cap;i++){

        }

    }
//    public static void resolve(int totle,int sum,int num){
//        if (totle)
//    }
}

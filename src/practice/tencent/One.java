package practice.tencent;

import java.util.Scanner;

/**
 * Created by tianfeng on 2018/4/5.
 */
public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int result = 0;

        for (int i = 1;i<=n;i+=2*m){
            int result1 = -((i+i+m-1)/2 )*m;
            int result2 = ((i+m+i+2*m-1)/2)*m;
            result += result1+result2;
        }
        System.out.println(result);

    }
}

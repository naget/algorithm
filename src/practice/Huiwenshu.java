package practice;

import java.util.Scanner;

/**
 * Created by tianfeng on 2018/4/1.
 */
public class Huiwenshu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        long first = 1;
        long second = 1;
        for (int i = 0;i<N;i++){
            first *=K;
        }
        int cha = N-K;
        for(int j = 0;j<N-cha-1;j++){
            second *=K;
        }
        System.out.println((first-(K-1)*second)%772235);
    }

}

package practice.kuaishou;

import java.util.Scanner;

/**
 * Created by tianfeng on 2018/4/20.
 */
public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextInt();
        long y = scanner.nextInt();
        long N = scanner.nextInt();
        long result=1;
        double result2=1;

        if(y<0){
            for(long j = 0;j<-y;j++){
                result2=result2/x;
            }
            System.out.println(result2%N);
        }else{
            for (long i = 0;i<N;i++){
                result=result*x;
            }
            System.out.println(result%N);
        }

    }
}

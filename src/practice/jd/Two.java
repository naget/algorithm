package practice.jd;

import java.util.Scanner;

/**
 * Created by tianfeng on 2018/4/9.
 */
public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] array = new long[n];
        long result;
        for (int i = 0;i<n;i++){
            array[i] = scanner.nextLong();
        }
        for (int j = 0;j< array.length;j++){
            if (array[j]%2==0){
                if ((result=array[j]/2)%2==1){
                    System.out.println(array[j]/2+" "+2);
                }else {
                    System.out.println("No");
                }

            }else System.out.println("No");
        }
    }
}

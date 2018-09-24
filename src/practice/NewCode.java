package practice;

import java.util.Scanner;

/**
 * Created by tianfeng on 2018/3/14.
 */
public class NewCode {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            int sum = sc.nextInt();
            int count = 0;
            int result1 = 0;
            int[] pi = new int[number];
            for (int i = 0;i<number;i++){
                pi[i] = sc.nextInt();
                for (int j=i-1;j>=0&&pi[i]<pi[j];j--){
                    int temp2 = pi[j];
                    pi[j] = pi[i];
                    pi[i] = temp2;
                }
            }
        for (int j=0;j<number;j++){
            if (sum==0){
                System.out.println(count);
                return;
            }
            else if (sum<pi[j]){
                result1 = pi[j]-sum;
                count++;
                for(int i = j-1;i>=0;i--){
                    if(result1>=pi[0]) {
                        if (result1-pi[i]>=0){
                            result1-=pi[i];
                            count--;
                        }
                        else continue;
                    }else {
//                        System.out.println(count);
                        return;
                    }
                    System.out.println(count);
                }
            }
            sum-=pi[j];
            count++;
        }


//        for (int i = 0;i<number;i++){
//            if (result1<pi[i])break;
//            count--;
//            if (result1<=0)break;
//        }
            System.out.println(count);
        }

}

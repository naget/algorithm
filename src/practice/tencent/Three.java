package practice.tencent;

import java.util.Scanner;

/**
 * Created by tianfeng on 2018/4/5.
 */
public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//机器数量
        int m = scanner.nextInt();//任务数量
        Data[] mechain = new Data[n];
        Data[] tast = new Data[m];
        for(int i = 0;i<n;i++){
            mechain[i].one=scanner.nextInt();
            mechain[i].two = scanner.nextInt();
        }
        for (int i=0;i<m;i++){
            tast[i].one = scanner.nextInt();
            tast[i].two = scanner.nextInt();
        }
        for(int i = 0;i<m;i++){
            for (int j = 0;j<n&&!tast[j].used;j++){
                if (mechain[i].one>=tast[i].one&&mechain[i].two>=tast[i].two){

                }
            }
        }

    }
    static class Data{
        int one;
        int two;
        boolean used;
    }


}

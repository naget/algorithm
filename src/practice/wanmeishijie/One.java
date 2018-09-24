package practice.wanmeishijie;

import java.util.Scanner;

/**
 * Created by tianfeng on 2018/4/27.
 */
public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] score = new int[n];
        int[] time = new int[n];
        double[] weight =new double[n];
        int totletime;
        for (int i = 0;i<n;i++){
            score[i] = scanner.nextInt();
        }
        for (int i = 0;i<n;i++){
            time[i] = scanner.nextInt();
            weight[i] = (double) score[i]/(double) time[i];
        }
        totletime = scanner.nextInt();
        int indexmax = -1;
        int totlescore=0;
        int max;
        while (true){
            if (totletime>0){
                max = getMaxWeightIndex(weight,indexmax);
                if (totletime-time[max]>=0&&indexmax!=max){
                    totletime = totletime-time[max];
                    totlescore = totletime+score[max];
                    indexmax = max;
                }else if(totletime-time[max]<0){
                    indexmax=max;
                }else {
                    break;
                }

            }break;
        }

    }
    public static int getMaxWeightIndex(double[] a,int maxindex){
        int index=0;
        if (maxindex==-1){
            for (int i = 0;i<a.length;i++){
                if (a[i]>a[index])index = i;
            }

        }else {
            int i=-1;
            index = maxindex;
            while (i<a.length-1&&a[++i]>a[maxindex])continue;
            if(a[i]<=a[maxindex]){
                index = i;

                for (int j = i;j<a.length&&a[j]<a[maxindex]&&i!=maxindex;j++){
                    if (a[j]>a[index])index = j;
                }
            }
        }


        return index;
    }

}

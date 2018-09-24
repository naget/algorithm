package practice.aiqiyi;

import java.util.Scanner;

/**
 * Created by tianfeng on 2018/4/19.
 */
public class Two {
    static int[] array = new int[3];
    static int max,mid,min,tmp;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        sort(A,B,C);
        while (!(max==mid&&mid==min)){
            if (max==mid){
                count++;
                min+=2;
                sort(max,mid,min);
            }else if(min==mid){
                count++;
                min += 1;
                mid += 1;
                sort(max, mid, min);
            }else if(mid-min>=2){
                count++;
                min+=2;
                sort(max,mid,min);
            }else {
                count++;
                min+=1;
                mid+=1;
                sort(max,mid,min);
            }
        }
        System.out.println(count);
    }
    public static void sort(int a,int b,int c){
        array[0] = a;array[1]=b;array[2]=c;
        for (int i = 0;i<2;i++){
            for (int j = i+1;j<3;j++){
                if (array[i]<array[j]){
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        max = array[0];mid=array[1];min = array[2];
    }
}

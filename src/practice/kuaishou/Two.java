package practice.kuaishou;

import java.util.Scanner;

/**
 * Created by tianfeng on 2018/4/20.
 */
public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] ss = s.split(" ");
        int[] array = new int[ss.length];
        for (int i=0;i<ss.length;i++){
            array[i] = Integer.valueOf(ss[i]);
        }
        int index = scanner.nextInt();
        if(index>array[array.length-1]){
            System.out.println(array.length);
        }else {
            System.out.println(solution(index,array,0,array.length-1));
        }
    }
    public static int solution(int index,int[] a,int lo,int hi){

        int mid = lo+(hi-lo)/2;
        if (lo>=hi)return lo;

        else if (index==a[mid])return mid;

        else if(index>a[mid])return solution(index,a,mid+1,hi);
        else return solution(index,a,lo,mid-1);
    }
}

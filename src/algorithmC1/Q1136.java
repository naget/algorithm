package algorithmC1;

import lib.StdRandom;

/**
 * Created by tianfeng on 2018/1/17.
 */
public class Q1136 {
    public static int M=10;
    public static int N=10000;
    public static void main(String[] args) {
        int[] a = new int[M];
        int[][] result = new int[M][M];
        for (int  i = 1;i<=N;i++){
            init(a);
            StdRandom.shuffle(a);
            for (int j = 0;j<a.length;j++){
                result[a[j]][j]++;
            }
        }
        Q1113$.print(result);
    }
    public static void init(int[] a){
        for (int  i= 0;i<a.length;i++){
            a[i] = i;
        }
    }

}

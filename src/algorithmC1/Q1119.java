package algorithmC1;

import lib.StdOut;

/**
 * Created by tianfeng on 2017/12/20.
 */
public class Q1119 {
    public static long[] table;

    /**
     * 这个递归，一个小时可能能跑完100个数,仅仅是可能
     * @param N
     * @return
     */
    public static long F(int N){
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-1)+F(N-2);
    }
    public static void main(String[] args){
        table = new long[200];
        for (int N = 0;N<100;N++){
            StdOut.println(N+" "+FF(N));
        }
    }

    /**
     * 改进算法 秒出结果
     * @param N
     * @return
     */
    public static long FF(int N){

        if (N==0){
            table[0]=0;
            return 0;
        }
        if (N==1){
            table[1]=1;
            return 1;
        }
        if (table[N-1]!=-1)
        {
            table[N]=table[N-1]+table[N-2];
            return table[N];
        }
        System.out.println("有错误");
        return -1;

    }
}

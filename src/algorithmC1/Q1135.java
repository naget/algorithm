package algorithmC1;

import lib.StdRandom;

/**
 * Created by tianfeng on 2018/1/15.
 * 掷骰子
 */
public class Q1135 {
    public static int SIDES = 6;
    public static void main(String[] args) {
        double[] experiment = experimentationResult(10000000);
        for (int i = 2;i<=2*SIDES;i++){
            System.out.println(i+" "+probability(i)+" "+experiment[i]);
        }

    }

    /**
     * 理论概率
     * @param k
     * @return
     */
    public static double probability(int k){
        double[] dist = new double[2*SIDES+1];
        for (int i=1;i<=SIDES;i++){
            for (int j = 1;j<=SIDES;j++){
                dist[i+j] += 1.0;
            }
        }
        for (int i =2;i<=2*SIDES;i++){
            dist[i]/=36.0;
        }
        return dist[k];
    }


    /**
     * 进行N次试验，
     * @param N
     * @return 实验结果
     */
    public static double[] experimentationResult(double N){
        double[] result = new double[2*SIDES+1];
        int[] time = new int[2*SIDES+1];
        for (int i = 1;i<=N;i++){
            int subresult1 = StdRandom.uniform(1,7);
            int subresult2 = StdRandom.uniform(1,7);
            time[subresult1+subresult2]++;
        }
        for (int j = 2;j<=2*SIDES;j++){
            result[j] = time[j]/N;
        }
        return result;
    }

}

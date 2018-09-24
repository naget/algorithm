package algorithmC1;

/**
 * Created by tianfeng on 2017/12/22.
 */
public class Q1127 {
    public static long count=0;
    public static void main(String[] args) {
       double[][] result =  binomial$(100,50,0.25);
        System.out.println(result[100][50]);
    }
    public static double binomial(int N,int k,double p){
        count ++;
        System.out.println(count);
        if (N==0&&k==0) return 1.0;
        if (N<0||k<0) return 0.0;
        return (1.0-p)*binomial(N-1,k,p)+p*binomial(N-1,k-1,p);
    }
    public static double[][] binomial$(int N,int k,double p){
//        if (N==0&&k==0) {
//            table[0][0] = 1.0;
//            return table[0][0];
//        }
//        if (N<0||k<0){
//            return 0.0;
//        }
//        if (table[N-1][k]>=0){
//            table[N][k] =
//        }                               准备效仿1119，结果不得行
         double[][] table = new double[N+1][k+1];
         table[0][0] = 1.0;
//         for (int i=1;i<k+1;i++){
//             table[0][i] = 0.0;
//         }
         for (int i =1;i<N+1;i++)
             table[i][0] = (1-p)*table[i-1][0]+0.0;
         for (int i = 1;i<N+1;i++)
             for (int j = 1;j<=i&&j<k+1;j++)
                 table[i][j] = (1.0-p)*table[i-1][j]+p*table[i-1][j-1];
        return table;
    }
}

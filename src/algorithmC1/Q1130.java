package algorithmC1;

/**
 * Created by tianfeng on 2017/12/26.
 * 公因数只有1的两个非零自然数，叫做互质数
 */
public class Q1130 {
    public static void init(boolean[][] a){
        for (int i = 0;i<a.length;i++){
            for (int j = 0;j<a[0].length;j++){
                if (Q1124.Euclid(i,j)==1){
                    a[i][j] = true;
                }else {
                    a[i][j]=false;
                }
            }
        }
    }

    public static void main(String[] args) {
        boolean[][] a = new boolean[9][10];
        init(a);
        for (boolean[] b:a){
            for (boolean c:b){
                System.out.print(c+" ");
            }
            System.out.println("\t");
        }
    }
}

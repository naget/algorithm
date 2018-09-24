package algorithmC1;

/**
 * Created by tianfeng on 2017/12/20.
 * int[][] a
 * a.length 矩阵行数
 * a[0].length 矩阵列数
 */
public class Q1113$ {
    static int M = 2;
    static int N = 5;
    public static void main(String[] args) {

        int[][] a= new int[M][N];//before
        int[][] b = new int[N][M];//after
        init(a);
        print(a);
        System.out.println("行数:"+a.length);
        System.out.println("列数:"+a[0].length);
        for (int i=0;i<M;i++){
            for (int j=0;j<N;j++){
                b[j][i] = a[i][j];
            }
        }
        System.out.println("=================转置矩阵=========================");
        print(b);
        System.out.println("行数:"+b.length);
        System.out.println("列数:"+b[0].length);
    }
    public static void init(int[][] a){
        for (int i = 0;i<a.length;i++){
            for (int j = 0;j<a[0].length;j++){
                a[i][j]=2*i+j;
            }
        }
    }
    public static void print(int[][] a){
        int A = a.length;
        int B = a[0].length;
        for (int i = 0;i<A;i++){
            for (int j = 0;j<B;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}

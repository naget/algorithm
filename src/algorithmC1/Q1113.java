package algorithmC1;

/**
 * Created by tianfeng on 2017/12/20.
 * 打印转置矩阵
 */
public class Q1113 {
    static int M = 2;
    static int N = 5;
    public static void main(String[] args) {

        int[][] a= new int[M][N];//原矩阵
        int[][] b = new int[N][M];//转置矩阵
        init(a);
        printa(a);
        System.out.println("行数："+a.length);
        System.out.println("列数："+a[0].length);
        for (int i=0;i<M;i++){
            for (int j=0;j<N;j++){
                b[j][i] = a[i][j];
            }
        }
        System.out.println("=================转置矩阵=========================");
        printb(b);
        System.out.println("行数："+b.length);
        System.out.println("列数："+b[0].length);
    }
    public static void init(int[][] a){
        for (int i = 0;i<M;i++){
            for (int j = 0;j<N;j++){
                a[i][j]=2*i+j;
            }
        }
    }
    public static void printa(int[][] a){
        for (int i = 0;i<M;i++){
            for (int j = 0;j<N;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
    public static void printb(int[][] b){
        for (int i = 0;i<N;i++){
            for (int j = 0;j<M;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}

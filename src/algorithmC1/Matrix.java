package algorithmC1;

/**
 * Created by tianfeng on 2018/1/9.
 * 功能：完成简单的矩阵计算
 * 未测试
 * 原因：矩阵计算的概念不是太懂，找个理由吧————蒋尚武没给我讲清楚
 */
public class Matrix {
    /**
     * 向量点乘
     * @param x
     * @param y
     * @return
     */
    public static double dot(double[] x,double[] y){
        if (x.length!=y.length) throw new IllegalArgumentException("点乘的两个向量"+x+"和"+y+"长度不一");
        if (x.length==0) throw new IllegalArgumentException("点乘的两个向量长度不可为0");
        return dodot(x,y);
    }

    private static double dodot(double[] x, double[] y) {
        double result=0;
        int length = x.length ==y.length?x.length:0;
        for (int i = 0;i<length;i++){
            result = result+x[i]*y[i];
        }
        return result;
    }

    /**
     * 矩阵和矩阵之积
     * @param a
     * @param b
     * @return
     */
    public static double[][] mult(double[][] a,double[][] b){
        if (a[0].length==b.length){
           return domult(a,b);
        }else {
            throw new IllegalArgumentException(a+"的列数需要和"+b+"的行数相等。");
        }
    }

    private static double[][] domult(double[][] a, double[][] b) {
        double[][] result = new double[a.length][b[0].length];
        for (int i = 0;i<a.length;i++){
            for (int j = 0;j<b[0].length;j++){
                result[i][j]=dot(a[i],b[j]);
            }
        }
        return result;
    }

    /**
     * 转置矩阵
     * @param a
     * @return
     */
    public static double[][] transpose(double[][] a){
        double[][] result = new double[a.length][a[0].length];
        for (int i = 0;i<a.length;i++){
            for (int j = 0;j<a[0].length;j++){
                result[j][i]=a[i][j];
            }
        }
        return result;
    }

    /**
     * 矩阵和向量之积
     * @param a
     * @param x
     * @return
     */
    public static double[] mult(double[][] a,double[] x){
        double[] result = new double[a.length];
        if (a.length==x.length){
            for (int i = 0;i<a.length;i++){
                result[i] = dot(a[i],x);
            }
            return result;
        }else throw new IllegalArgumentException(a+"和"+x+"不符合相乘规范");
    }

    /**
     * 向量和矩阵之积
     * @param x
     * @param a
     * @return
     */
    public static double[] mult(double[] x,double[][] a){
        double[] result = new double[a[0].length];
        double[] temp = new double[a.length];
        if (x.length==a.length){
            for (int i = 0;i<a[0].length;i++){
                for (int j = 0;j<a.length;j++)
                {
                    temp[j] = a[j][i];
                }
                result[i] = dot(x,temp);
            }
            return result;
        }else throw new IllegalArgumentException(x+"和"+a+"不符合相乘规范");
    }
}

package algorithmC1;

/**
 * Created by tianfeng on 2017/12/20.
 */
public class Q1115 {
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6};
        System.out.println(a.length==plusresult(histogram(a,7)));
    }
    public static int[] histogram(int[] a,int M){
        int[] result = new int[M];
        for (int i = 0;i<M;i++){
            result[i]=getResult(i,a);
        }
        return result;
    }
    public static int getResult(int i,int[] a){
       int result = 0;
       for (int j = 0;j<a.length;j++){
           if (a[j]==i) result++;
       }
       return result;
    }
    public static int plusresult(int[] a){
        int result = 0;
        for (int i = 0;i<a.length;i++){
            result = result+a[i];
        }
        return result;
    }
}

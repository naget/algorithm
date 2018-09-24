package algorithmC1;

/**
 * Created by tianfeng on 2017/12/20.
 */
public class Q1114 {
    public static void main(String[] args) {
        System.out.println(lg(17));
    }

    public static int lg(int N){
        int result = 0;
        if (N<=0){
            System.out.println("所给数字必须大于0");
            return -1;
        }
        N=N/2;
        while (N>0){
            result++;
            N=N/2;
        }
        return result;
    }
}

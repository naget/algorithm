package algorithmC1;

/**
 * Created by tianfeng on 2017/12/21.
 * 计算两个数的最大公约数（欧几里得算法）
 */
public class Q1124 {
    public static void main(String[] args) {
        System.out.println(Euclid(1111111,1234567));
    }
    public static int Euclid(int a,int b){

        return a>b?Eculid(a,b,true):Eculid(b,a,true);
    }

    private static int Eculid(int max, int min, boolean b) {
        if (min<=0) return -1;
        System.out.println("max="+max+"  min="+min);
        int mo = max%min;
        if (mo == 0)return min;
        else {
           return Eculid(min,mo,true);
        }
    }
}

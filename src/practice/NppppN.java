package practice;

/**
 * Created by tianfeng on 2018/1/18.
 * n++ 返回旧值 ++n 返回新值
 */
public class NppppN {
    public static void main(String[] args) {
        int b = 1;
        int a = b++;
        System.out.println("a="+a+" b="+b);
        b=1;
        int c = ++b;
        System.out.println("c="+c+" b="+b);
    }
}

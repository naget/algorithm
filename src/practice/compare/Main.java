package practice.compare;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

/**
 * created by tianfeng on 2018/6/3
 */
public class Main {
    public static void main(String[] args) {
        Goods g1=new Goods(1,"可乐",new Date(System.currentTimeMillis()));
        Goods g2=new Goods(2,"面包",new Date(System.currentTimeMillis()+1000));
        System.out.println(g1.compareTo(g2));
        Goods[] goodss = {g2,g1};
        Arrays.sort(goodss);
        System.out.println(goodss[0].getNum());
        Arrays.sort(goodss,new GoodsDateCompartor());
        Arrays.sort(goodss,new GoodsNumCompartor());

    }
}

package practice.compare;

import java.util.Comparator;

/**
 * created by tianfeng on 2018/6/3
 */
public class GoodsNumCompartor implements Comparator<Goods> {
    @Override
    public int compare(Goods o1, Goods o2) {
        if (o1.getNum()>o2.getNum())return 1;
        else if(o1.getNum()==o2.getNum())return 0;
        else return -1;
    }
}

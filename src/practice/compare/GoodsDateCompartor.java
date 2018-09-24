package practice.compare;

import java.util.Comparator;

/**
 * created by tianfeng on 2018/6/3
 */
public class GoodsDateCompartor implements Comparator<Goods> {
    @Override
    public int compare(Goods o1, Goods o2) {
        return o1.getDate().compareTo(o2.getDate());
    }
}

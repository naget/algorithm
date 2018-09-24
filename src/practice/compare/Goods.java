package practice.compare;

import java.util.Date;

/**
 * created by tianfeng on 2018/6/3
 */
public class Goods implements Comparable<Goods> {


    int num;
    String s;
    Date date;
    public Goods(int num, String s, Date date) {
        this.num = num;
        this.s = s;
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int compareTo(Goods o) {
        if (this.num>o.num)return 1;
        else if (this.num==o.num) return 0;
        else  return -1;
    }
}

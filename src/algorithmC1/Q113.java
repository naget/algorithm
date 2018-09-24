package algorithmC1;

import lib.StdIn;

/**
 * Created by tianfeng on 2017/12/20.
 * ide里不知道怎么输入args,从terminal里有不能同时编译Stdin,程序会处在一直等待输入的状态
 */
public class Q113 {
    public static void main(String[] args) {
        int[] eles = StdIn.readInts();
        if (eles[0]==eles[2]&&eles[1]==eles[0]){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }

    }
}

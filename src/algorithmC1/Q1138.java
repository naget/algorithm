package algorithmC1;

import lib.In;
import lib.StdIn;

import java.util.Arrays;

/**
 * Created by tianfeng on 2018/1/17.
 * 命令行输入参数没整好，同Q113
 */
public class Q1138 {
    public static void main(String[] args) {
        int[] whiteList = In.readInts();
        Arrays.sort(whiteList);
        while (!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if (forceSearch(key,whiteList)<0)
                System.out.println(key);
        }
    }
    public static int forceSearch(int key,int[] a){
        for (int i = 0;i<a.length;i++){
            if (a[i]==key) return i;
        }
        return -1;
    }
}

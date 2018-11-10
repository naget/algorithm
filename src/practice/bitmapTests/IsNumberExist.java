package practice.bitmapTests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * created by tianfeng on 2018/11/9
 * 在一个大文件（1亿个数）中判断一个数是否存在
 * 解决方案：bitmap，首先判断出这个数最大可能多大，比如最大是一亿，那么我们只需要一亿零一bit来存放文件中
 * 所有数的情况。第一位表示0，第二位表示1，......第一亿零一位表示一亿。位上如果为1，表示对应的数存在，为
 * 0表示不存在，用文件中的数对这个bitmap进行初始化之后，当我们想要判断一个数是否在这个文件中时，只需要看
 * 看这个数对应的那一位是否为1就可以了。使用bitmap主要是缩小了数据所占的空间。
 */
public class IsNumberExist {
    private int[] bitmap;
    private int size;
    private int SHIFT = 5;//2的5次方是32
    public  boolean isNumberExist(int number){
        int bit = number>>SHIFT;
        int index = number&((1<<SHIFT)-1);
        return ((1<<index)&bitmap[bit])!=0;
    }
    public IsNumberExist(int size){
        this.size = size;
        bitmap = new int[(size>>SHIFT)+1];
    }
    public void insertDate(int number){
        int bit = number>>SHIFT;
        int index = number&((1<<SHIFT)-1);
        bitmap[bit] = bitmap[bit]|(1<<index);
    }
    public void insertFromTxt(String filename){
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String str = null;
            while ((str = br.readLine())!=null){
                insertDate(Integer.valueOf(str));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("当前JVM所占内存："+(rt.totalMemory()-rt.freeMemory())/1024/1024+"M");
        IsNumberExist tool = new IsNumberExist(100000000);
        System.out.println("当前JVM所占内存："+(rt.totalMemory()-rt.freeMemory())/1024/1024+"M");
        //Date.makeNumbers(100000000);//生成一亿个数到number.txt
        tool.insertFromTxt("numbers.txt");//使用这个一亿个数初始化bitmap的状态
        System.out.println(tool.isNumberExist(88888888));//判断88888888是否在这个文件中
        System.out.println(tool.isNumberExist(99999999));//判断99999999是否在这个文件中
        System.out.println(tool.isNumberExist(91725151));//判断91725151是否在这个文件中
        System.out.println("当前JVM所占内存："+(rt.totalMemory()-rt.freeMemory())/1024/1024+"M");



    }
}

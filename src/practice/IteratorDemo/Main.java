package practice.IteratorDemo;

import lib.In;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * created by tianfeng on 2018/6/10
 */
public class Main {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,6,5,4,8,9,6,5,6,6};
        MyIntegerContainer myContainer = new MyIntegerContainer(array);
        Integer[] date = myContainer.getDate();
        for (int i =0;i<date.length;i++){
            System.out.println(date[i]);
        }
//        for(Object a :
//                myContainer) {
//            System.out.println(a);
//        }

//        int[] array = {1,2,2,3,4,6,7};
//        for (int i=0;i<array.length;i++){
//            System.out.println(array[i]);
//        }


    }
}

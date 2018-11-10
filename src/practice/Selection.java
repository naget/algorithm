package practice;

import practice.strings.CountSort;

/**
 * Created by tianfeng on 2018/2/24.
 */
public class Selection {
    public static void sort(int[] array){
        int N =array.length;//数组长度
        for (int i = 0;i<N-1;i++){//2018年9月4日21:12:52将N改为N-1
            //将array[i]和array[i+1..N]中的最小元素交换
            int min = i;//记录下最小元素的索引
            for (int j = i+1;j<N;j++){
                if (array[min]>array[j])min = j;//寻找真正最小元素的索引
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {2,5,6,8,4,2,5,4,8,6};
        CountSort.sort(array);
        for (int i :
                array) {
            System.out.print(i+" ");
        }
    }
}

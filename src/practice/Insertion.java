package practice;

/**
 * Created by tianfeng on 2018/2/24.
 * 注意：内层for循环中，条件是j>0
 */
public class Insertion {
    public static void sort(int[] array){
        int N =array.length;
        for (int i = 0;i<N;i++){
            for (int j = i;j>0&&array[j]<array[j-1];j--){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
        }
    }
}

package practice;

/**
 * Created by tianfeng on 2018/3/3.
 */
public class ShellSort {
    public static void sort(int[] array){
        int N = array.length;
        int h = 1;
        while (h<N/3)h=3*h+1;
        while (h>=1){
            //使数组h有序
            for (int i = h;i<N;i++){
                for (int j = i;j>=h&&array[j]<array[j-h];j-=h){
                    int temp = array[j];
                    array[j] = array[j-h];
                    array[j-h] = temp;
                }
            }
            h=h/3;
        }

    }
}

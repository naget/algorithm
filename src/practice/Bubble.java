package practice;

/**
 * Created by tianfeng on 2018/2/24.
 */
public class Bubble {
    public static void sort(int[] array){
        int N = array.length;
        for (int i = N-1;i>=0;i--){
            for (int j = 0;j<i;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}

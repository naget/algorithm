package practice;

/**
 * Created by tianfeng on 2018/5/3.
 */
public class Heap {
    public static int temp;
    public static void sort(int[] array){
        int N = array.length;
        int[] newarray = new int[N+1];
        System.arraycopy(array, 0, newarray, 1, N);
        sort(newarray,true);
        System.arraycopy(newarray, 1, array, 0, N);
    }
    public static void sort(int[] array,boolean flag){
        int N = array.length-1;
        //堆的构建
        for (int i=N/2;i>=1;i--){
            sink(array,i,N);
        }
        //下沉排序
        while (N>1){
            temp = array[1];
            array[1]=array[N];
            array[N]=temp;
            sink(array,1,--N);
        }
    }
    //小的元素下沉
    private static void sink(int[] array, int k, int N) {
        while (2*k<=N){
            int j = 2*k;
            if (j<N&&array[j]<array[j+1])j++;
            if (array[k]>=array[j])break;
            temp = array[k];
            array[k] = array[j];
            array[j] = temp;
            k=j;
        }
    }
}

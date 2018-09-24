package practice;

/**
 * Created by tianfeng on 2018/3/22.
 * 三向切分的快速排序
 */
public class Quick3way {
    public static int temp;
    public static void sort(int[] array){
        sort(array,0,array.length-1);
    }

    private static void sort(int[] array, int lo, int hi) {
        if (lo>=hi)return;
        int lt=lo,i=lo+1,gt=hi;
        int lonum = array[lo];//array[Lo]会发生变化，需要记录下来,对比时候用
        while (i<=gt){
            if (array[i]<lonum){
                temp = array[i];
                array[i] = array[lt];
                array[lt]=temp;
                i++;lt++;
            }else if(array[i]>lonum){
                temp = array[i];
                array[i] = array[gt];
                array[gt] = temp;
                gt--;
            }else {
                i++;
            }
        }
        sort(array,lo,lt-1);
        sort(array,gt+1,hi);

    }
}

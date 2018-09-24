package practice;

/**
 * Created by tianfeng on 2018/3/4.
 * 自顶向下的归并排序
 */
public class MergeSortUptoDown {
    public static int[] aux;//auxiliary 辅助的  数组
    public static void sort(int[] array){
        aux = new int[array.length];
        sort(array,0,array.length-1);
    }
    private static void sort(int[] array,int lo,int hi){
        if (lo>=hi) return;
        sort(array,lo,lo+(hi-lo)/2);
        sort(array,lo+(hi-lo)/2+1,hi);
        merge(array,lo,lo+(hi-lo)/2,hi);
    }
//merge的是array[lo]到array[hi]之间的元素
    public static void merge(int[] array, int lo, int mid, int hi) {
        for (int k=lo;k<=hi;k++){//复制array[lo]到array[hi]之间的元素到aux
            aux[k]=array[k];
        }
        int i = lo;
        int j = mid+1;
        for (int k = lo;k<=hi;k++){//归并两个子数组
            if (i>mid) array[k] = aux[j++];//左数组索引越界
            else if (j>hi) array[k]=aux[i++];//右数组索引越界
            else if (aux[i]>aux[j])array[k]=aux[j++];
            else array[k]=aux[i++];
        }
    }
}

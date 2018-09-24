package practice;

/**
 * Created by tianfeng on 2018/3/6.
 * 自底向上的归并排序
 */
public class MergeSortDowntoUp {
    public static int[] aux;
    public static void sort(int[] array){
        aux = new int[array.length];
        for (int sz=1;sz<array.length;sz=2*sz){//sz<N  如果小于N/2 可能漏掉某些元素
            for (int i = 0;i<array.length-sz;i=i+2*sz){//i是子数组的索引
                merge(array,i,i+sz-1,Math.min(i+2*sz-1,array.length-1));//注意后两个参数，要减一，以及取小
            }
        }
    }
    public static void merge(int[] array,int lo,int mid,int hi){
        int i = lo;
        int j = mid+1;
        for (int k = lo;k<=hi;k++){
            aux[k] = array[k];
        }
        for (int k = lo;k<=hi;k++){
            if (i>mid)array[k]=aux[j++];
            else if (j>hi) array[k]=aux[i++];
            else if (aux[i]>aux[j])array[k] = aux[j++];
            else array[k] = aux[i++];
        }
    }

}

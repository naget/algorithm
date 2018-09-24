package practice;

/**
 * Created by tianfeng on 2018/3/22.
 */
public class Quick {
    public static int temp;
    public static void sort(int[] array){
         sort(array,0,array.length-1);
    }
    public static void sort(int[] array,int lo,int hi){
        if (lo>=hi)return;
        int k = partition(array,lo,hi);
        sort(array,lo,k-1);
        sort(array,k+1,hi);
    }
    public static int partition(int[] array,int lo,int hi){
        int i = lo;
        int j = hi+1;
        while (true){
            while (array[++i]<array[lo])if (i==hi)break;//从左开始找比切分元素大的元素，找到就往下进行
            while (array[--j]>array[lo])if (j==lo)break;//从右开始找比切分元素小的元素，找到就往下进行
            if (i>=j)break;//退出while(true)的条件
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }

        temp = array[lo];
        array[lo] = array[j];
        array[j]=temp;
        return j;

    }
}

package algorithmC1;

/**
 * Created by tianfeng on 2017/12/26.
 */
public class Q1129 {
    /**
     * 二分查找
     * @param a
     * @param key
     * @return
     */
    public static int rank(int[] a,int key){
        return rank(a,key,0,a.length-1);
    }
    public static int rank(int[] a,int key,int lo,int hi){
        if (lo<hi){
            int mid = (lo+hi)/2;
            if (a[mid] == key)return mid;
            if (a[mid]<key)return rank(a,key,mid,hi);
            if (a[mid]>key)return rank(a,key,lo,mid);
        }
        return -1;
    }

    /**
     *
     * @param a 有序数组
     * @param index 所找key的下标
     * @return 返回小于key的个数
     */
    public static int rand(int[] a,int index){
        int tem = index;
        while (a[index]==a[index-1]){
            index--;
        }
        return index;
    }

    /**
     *
     * @param a 有序数组
     * @param index key对应的下标
     * @return 与key相等的元素数量
     */
    public static int count(int[] a,int index){
        int count=1;
        int indexcopy = index;
        while (index-1>=0&&a[index]==a[index-1]){
            index--;
            count++;
        }
        while (indexcopy+1<a.length&&a[indexcopy]==a[indexcopy+1]){
            indexcopy++;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,3,3,4,5,6,7,7,7,7,7,7,7,9};
        System.out.println(count(a,rank(a,2)));
    }
}

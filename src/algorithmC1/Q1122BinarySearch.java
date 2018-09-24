package algorithmC1;

/**
 * Created by tianfeng on 2017/12/21.
 * 二分查找
 */
public class Q1122BinarySearch {
    static int deep = 0;
    public static void main(String[] args) {
        int[] a = new int[88];
        for (int i = 0;i<a.length;i++){
            a[i] = i;
        }
        System.out.println(rank(4,a));
    }
    public static int rank(int key,int[] a){
        return rank(key,a,0,a.length-1);
    }
    private static int rank(int key,int[] a,int lo,int hi){
        deep++;
        System.out.print("递归深度："+deep);
        for (int i = 0;i<deep;i++){
            System.out.print(" ");
        }
        System.out.println("lo="+lo+" "+"hi="+hi);
        if (lo<hi){
            int mid = (lo+hi)/2;
            if (key == a[mid]) return mid;
            if (key>a[mid]) return rank(key,a,mid,hi);
            if (key<a[mid]) return rank(key,a,lo,mid);
        }
        return -1;
    }
}

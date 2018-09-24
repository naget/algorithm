package practice.search;

/**
 * created by tianfeng on 2018/9/3
 */
public class BinarySearch {
    public static int search(int[] array,int key){
        return search(array,key,0,array.length-1);
    }
    public static int search(int[] array,int key,int lo,int hi){
        if (lo>hi)return lo;
        int mid  = lo + (hi-lo)/2;
        if (key<array[mid])return search(array,key,lo,mid-1);
        else if(key>array[mid])return search(array,key,mid+1,hi);
        else return mid;
    }
    public static int search(int[] array,int key,boolean notrecursion){
        int lo =0;
        int hi = array.length-1;
        while (lo<=hi){
            int mid  = lo +(hi-lo)/2;
            if (key<array[mid]) hi=mid-1;
            else if (key>array[mid])lo=mid+1;
            else return mid;
        }
        return lo;
    }

    public static void main(String[] args) {
        int[] a  = {0,1,2,3,4,5,6,7,8,9,10,16,35,67,77,778};
        System.out.println(search(a,15));
    }

}

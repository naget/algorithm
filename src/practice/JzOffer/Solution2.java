package practice.JzOffer;

/**
 * Created by tianfeng on 2018/3/14.
 */
public class Solution2 {
    public static boolean Find(int target, int[][] array) {
        return Find(target,array.length-1,0,array);
    }
    public static boolean Find(int target,int index1,int index2,int[][] array){
        if (index1<0||index2>=array[0].length) return false;
        else if (array[index1][index2]>target) return Find(target,index1-1,index2,array);
        else if (array[index1][index2]<target) return Find(target,index1,index2+1,array);
        else return true;
    }
    public static void main(String[] args) {
        int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(Solution2.Find(7,array));
    }

}
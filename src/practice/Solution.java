package practice;

public class Solution {
    public static boolean Find(int target, int [][] array) {
        int index1 = Find1(target,0,array.length-1,array);
        int index2 =Find2(target,0,array[0].length-1,array,index1);
        int result = array[index1][index2];
        if(result==target) return true;
        else return false;
    }
    public static int Find1(int target,int lo1,int hi1,int[][] array){
        if(lo1>=hi1) return hi1;
        else if(array[lo1+(hi1-lo1)/2][0]==target) return lo1+(hi1-lo1)/2;
        else if(array[lo1+(hi1-lo1)/2][0]>target)return Find1(target,lo1,lo1+(hi1-lo1)/2-1,array);
        else return Find1(target,lo1+(hi1-lo1)/2+1,hi1,array);
     }
    public static int Find2(int target,int lo1,int hi1,int[][] array,int index1){
        if(lo1>=hi1) return hi1;
        else if(array[index1][lo1+(hi1-lo1)/2]==target) return lo1+(hi1-lo1)/2;
        else if(array[index1][lo1+(hi1-lo1)/2]>target) return Find2(target,lo1,lo1+(hi1-lo1)/2-1,array,index1);
        else return Find2(target,lo1+(hi1-lo1)/2+1,hi1,array,index1);
     }

    public static void main(String[] args) {
        int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(Solution.Find(7,array));
    }
}
package practice;

import java.util.HashSet;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        boolean[][] result = new boolean[length][length];
        int[] array = new int[length];
        int k = in.nextInt();
        for(int i = 0;i<length;i++){
            array[i] = in.nextInt();
        }
        for(int i = 0;i<length-1;i++){
            for(int j = i+1;j<length;j++){
                if(array[i]+k==array[j]||array[j]+k==array[i]){

                    result[i][j] = true;
                    result[j][i] = true;
                }
            }
        }
        for(int i = 0;i<length;i++){
            for(int j = 0;j<length;j++){
                if(result[i][j]){
                    if (set.contains(array[i])&&!set.contains(array[j])){
                        count++;
                        set.add(array[j]);
                    }else if(set.contains(array[j])&&!set.contains(array[i])){
                        count++;
                        set.add(array[i]);
                    }else if(!set.contains(array[j])&&(!set.contains(array[i]))){
                        count++;
                        set.add(array[i]);
                        set.add(array[j]);
                    }else {
                    }

                }
            }
        }
        System.out.println(count);
    }
}
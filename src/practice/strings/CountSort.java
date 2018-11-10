package practice.strings;

/**
 * created by tianfeng on 2018/9/26
 * 计数排序
 */
public class CountSort {
    public static void sort(int[] A){
        System.out.println("开始计数排序");
        int n = A.length;
        int max=0,min=0;
        for (int i=0;i<n;i++){
            if (A[i]>max)max=A[i];
            else if (A[i]<min)min = A[i];
        }
        int BLength = max-min+2;
        int[] B = new int[BLength];
        for (int i=0;i<n;i++){
            B[A[i]-min+1]++;
        }
        for (int i=0;i<BLength-1;i++){
            B[i+1] +=B[i];
        }
        int[] C = new int[n];
        for (int i=0;i<n;i++){
            C[B[A[i]-min]++] = A[i];
        }
        for (int i=0;i<n;i++){
            A[i] = C[i];
        }
    }
}

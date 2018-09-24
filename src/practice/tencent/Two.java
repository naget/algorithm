package practice.tencent;

import java.util.Scanner;

/**
 * Created by tianfeng on 2018/4/5.
 */
public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int A = scanner.nextInt();
        int X = scanner.nextInt();
        int B = scanner.nextInt();
        int Y = scanner.nextInt();
        long result = 0;
        long tempresult;
        if (X<=0&&Y<=0)result=0;
        else if (X<=0)result=(tempresult=K%Y)==0?tempresult:0;
        else if (Y<=0)result=(tempresult=K%X)==0?tempresult:0;
        else {
            for (int i=0;i<=X;i++){
                for (int j = 0;j<=Y;j++){
                    if (A*i+B*j==K)result+=getResult(i,j,X,Y);
                }
            }
        }
        System.out.println(result%1000000007);

    }
    public static long getResult(int i,int j,int X,int Y){
        long result1=0,result2=0;
        int temp1 = 1,temp2 = 1;
        if (i == 0)result1=0;
        else {
            for(int w = X;w>X-i;w--){
                temp1 *=w;
            }
            for (int y = i;y>1;y--){
                temp2 *=y;
            }
            result1 = temp1/temp2;
        }
        temp1 = 1;temp2=1;
        if (j ==0)result2 =0;
        else {
            for(int w = Y;w>Y-j;w--){
                temp1 *=w;
            }
            for (int y = j;y>1;y--){
                temp2 *=y;
            }
            result2 = temp1/temp2;
        }


        return result1*result2;
    }
}

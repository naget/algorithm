package practice;
import java.util.Scanner;
/**
 * Created by tianfeng on 2018/3/23.
 */
public class Dongtaiguihua {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int[] x = new int[5];
            int[] y = new int[5];
            int time = in.nextInt();
            for(int i = 0;i<time;i++){
                for(int j=1;j<=4;j++){
                    x[j] = in.nextInt();
                }
                for(int w = 1;w<=4;w++){
                    y[w] = in.nextInt();
                }
                if(((x[1]-x[2])*(x[1]-x[2])+(y[1]-y[2])*(y[1]-y[2]))!=((x[3]-x[4])*(x[3]-x[4])+(y[3]-y[4])*(y[3]-y[4]))){
                    System.out.println("No");
                    continue;
                }
                if(((x[1]-x[3])*(x[1]-x[3])+(y[1]-y[3])*(y[1]-y[3]))!=((x[2]-x[4])*(x[2]-x[4])+(y[2]-y[4])*(y[2]-y[4]))){
                    System.out.println("No");
                    continue;
                }
                System.out.println("Yes");
            }
    }
}

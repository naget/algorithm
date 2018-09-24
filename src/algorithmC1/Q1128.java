package algorithmC1;

/**
 * Created by tianfeng on 2017/12/26.
 * 去除有序数组的重复项
 */
public class Q1128 {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 4, 4, 5, 5, 6, 7,8,8,9,99};//排好序的数组
        int[] afterdeletsame = deletsame(a);
        for (int b : afterdeletsame) {
            System.out.print(b + " ");
        }

    }

    private static int[] deletsame(int[] a) {
        int samecount = 0;
        for (int i = 0; i < a.length - 1 - samecount; i++) {
            if (a[i] == a[i + 1]) {
                for (int j = i; j < a.length - 1 - samecount; j++) {
                    a[j] = a[j + 1];
                }
                samecount++;
            }

//            System.out.println("samecount:" + samecount + " ");
//            for (int p : a) {
//                System.out.print(+p + " ");
//            }
//            System.out.println("");                   //调试代码
        }
        int[] b = new int[a.length - samecount];
        for (int k = 0; k < b.length; k++) {
            b[k] = a[k];
        }
        return b;
    }
}

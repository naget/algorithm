package practice.threadlocals;

/**
 * created by tianfeng on 2018/10/19
 */
public class Hash_increment {
    private static int hash = 0;
    private static final int HASH_INCREMENT = 0x61c88647;
    public static void main(String[] args) {
        int len = 16;
        int time = len/4*3;
        while (len<200){
            System.out.print("len等于"+len+"时：");
            for (int i=0;i<time;i++){
                System.out.print(String.valueOf(increment()&len-1)+" ");
            }
            System.out.println();
            len=len<<1;
            time = len/4*3;
        }

    }
    public static int increment(){
        return hash+=HASH_INCREMENT;
    }
}

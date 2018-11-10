package practice.bitmapTests;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * created by tianfeng on 2018/11/9
 */
public class Date {
    public static boolean makeNumbers(int size){
        boolean flag = true;
        Random random = new Random();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("numbers.txt"));
            for (int i = 0;i<size;i++){
                bw.write(String.valueOf(Math.abs(random.nextInt(size))));
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
    }
}

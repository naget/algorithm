package practice.bitmapTests;

/**
 * created by tianfeng on 2018/11/9
 * 使用bitmap进行排序(待排序数组中无重复数字)
 */
public class BitmapSort {
    private int maxNumber;
    private int[] bitmap;
    public void sort(int[] array){
        for (int i = 0;i<array.length;i++){
            int number = array[i];
            int bit = number>>5;
            int index = number&((1<<5)-1);
            bitmap[bit] |= 1<<index;
        }
        for (int i=0;i<bitmap.length;i++){
            for (int j = 0;j<32;j++){
                if ((bitmap[i]&(1<<j))!=0){
                    System.out.print(i*32+j+" ");
                }
            }
        }
    }
    public BitmapSort(int maxNumber){
        this.maxNumber = maxNumber;
        bitmap = new int[(maxNumber>>5)+1];
    }

    public static void main(String[] args) {
        BitmapSort bitmapSort = new BitmapSort(88);
        int[] array = {88,86,45,65,78,75,12,35,24,5,1,23};
        bitmapSort.sort(array);
    }
}

//package practice;
//
///**
// * Created by tianfeng on 2018/3/28.
// */
//public class MaxPQ<T extends Comparable> {
//    T[] array;
//    int CAPACITY;
//    int size=0;
//    public MaxPQ(int CAPACITY){
//        array = (T[]) new Object[CAPACITY];
//    }
//    public void insert(T t){
//        array[size++]=t;
//    }
//    public T delMax(){
//        int maxindex = 0;
//        for (int i=1;i<=size){
//            if (array[i]>array[maxindex]){
//                maxindex = i;
//            }
//        }
//        T temp = array[maxindex];
//        array[maxindex] = array[size];
//        array[size] = null;
//        return temp;
//    }
//}

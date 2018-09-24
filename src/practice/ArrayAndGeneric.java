package practice;

import java.util.Stack;

/**
 * Created by tianfeng on 2018/1/21.
 * 数组和泛型
 */
public class ArrayAndGeneric {
    public static void main(String[] args) {
        Stack<String>[] stk = (Stack<String>[]) new Stack[10];

//        Object[] array = new String[10];
//        array[0] = 10;               //运行时错误

//        List< Object> list = new ArrayList< String>();
//       list.add(10);                  //编译时错误
    }
}

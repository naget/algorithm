package practice.aiqiyi;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by tianfeng on 2018/4/19.
 */
public class One {
    static Stack<Character> stack = new Stack();
    static String s;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ss = scanner.nextLine();
        Stack<Character> result = new Stack<>();
        s=ss;
        for (int i = 0;i<s.length();i++){
            compare(i,stack.size());
        }
        while (!stack.empty()){
            result.push(stack.pop());
        }
        while (!result.empty()){
            System.out.print(result.pop());
        }
    }
    public static void compare(int i,int j){
        if (j<=0)stack.push(s.charAt(i));
        else if (Character.getNumericValue(s.charAt(i))<=Character.getNumericValue(stack.get(j-1)))stack.push(s.charAt(i));
        else {
            stack.pop();
            compare(i,j-1);
        }
    }
}

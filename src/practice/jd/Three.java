package practice.jd;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by tianfeng on 2018/4/9.
 */
public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  =scanner.nextInt();
        scanner.nextLine();
        Stack stack ;
        char c;
        int count=0;
        String[] strings = new String[n];
        for (int i = 0;i<n;i++){
            strings[i] = scanner.nextLine();
        }
        for(int i = 0;i<n;i++){
            stack = new Stack();
            count=0;
            for (int j=0;j<strings[i].length();j++){
                if ((c=strings[i].charAt(j))=='(')stack.push(c);
                else if ((c=strings[i].charAt(j))==')'){
                    if (!stack.empty())stack.pop();
                    else count++;
                }
            }
            if (stack.empty()&&count==0) System.out.println("Yes");
            else if(stack.size()==1&&count==1) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}

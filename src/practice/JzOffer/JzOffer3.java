package practice.JzOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by tianfeng on 2018/3/19.
 * 反转链表
 */
public class JzOffer3 {
    //使用栈
    public ArrayList<Integer> printListFromTailToHead2(ListNode list) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> array = new ArrayList<>();
        if(list!=null){
            stack.push(list.val);
            while(null!=list.next){
                list = list.next;
                stack.push(list.val);
            }
            while(!stack.empty()){
                Integer sum = stack.pop();
                array.add(sum);
                System.out.println(sum);
            }
        }

        return array;
    }
    //改链表的箭头
    public ArrayList<Integer> printListFromTailToHead(ListNode list) {
        ListNode temp;
        ListNode head=null;
        ListNode p = null;
        ArrayList<Integer> array = new ArrayList<>();
            if(list==null){
               return array;
            }
            while (list!=null){
                temp=list.next;
                list.next=head;
                head = list;
                if (temp!=null)p=temp;
                list = temp;
            }

        while (p!=null){
                array.add(p.val);
                p=p.next;
        }

        return array;
    }

         public class ListNode {
             int val;
             ListNode next = null;

             ListNode(int val) {
                 this.val = val;
            }
        }


}

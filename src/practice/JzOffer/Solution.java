//package practice.JzOffer;
////归并两个链表
//public class Solution {
//    public ListNode Merge(ListNode list1,ListNode list2) {
//       if(list1==null)return list2==null?null:list2;
//       if(list2==null)return list1==null?null:list1;
//        ListNode list1point = null;
//         ListNode list2point = null;
//        ListNode head =null;
//        if(list1.val>list2.val){
//            head = list1;
//            list1=list1.next;
//        }else{
//            head = list2;
//            list2=list2.next;
//        }
//        ListNode result = head;
//       while(list1!=null||list2!=null){
//           if(list1==null){
//               head.next = list2;
//                break;
//           }else if(list2==null){
//               head.next = list1;
//               break;
//           }else if(list1.val>list2.val){
//                list2point=list2.next;
//                head.next =  list2;
//                head = head.next;
//                list2=list2point;
//            }else{
//                list1point = list1.next;
//                head.next = list1;
//                head = head.next;
//                list1 = list1point;
//            }
//       }
//        return result;
//    }
//    public class ListNode {
//        int val;
//        ListNode next = null;
//
//        ListNode(int val) {
//            this.val = val;
//        }
//}
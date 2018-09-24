package practice;

/**
 * Created by tianfeng on 2018/4/28.
 * 基于下压栈实现的优先队列
 */
public class MaxPQbyStack<Item extends Comparable> {
    private Node first;
    private int N;
    private class Node{
        Item item;
        Node before;
        Node next;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public int size(){
        return N;
    }
    public void push(Item item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        if (oldFirst!=null)oldFirst.before = first;
        N++;
    }
    public Item pop(){
        Node temp = first;
        Node maxNode=first;
        while (temp!=null){
            if (temp.item.compareTo(maxNode.item)>0){
                maxNode = temp;
            }
            temp = temp.next;

        }
        if (maxNode==first){
            Item item = first.item;
            first = first.next;
            N--;
            return item;
        }else {
            maxNode.before.next = maxNode.next;
            if (null!=maxNode.next) maxNode.next.before= maxNode.before;
            N--;
            return maxNode.item;
        }



    }

    public static void main(String[] args) {
        MaxPQbyStack maxPQbyStack = new MaxPQbyStack();
        maxPQbyStack.push(100);
        maxPQbyStack.push(10);
        maxPQbyStack.push(50);
        maxPQbyStack.push(122);
        while (!maxPQbyStack.isEmpty()){
            System.out.println(maxPQbyStack.pop());
        }
        System.out.println(maxPQbyStack.size());
    }
}

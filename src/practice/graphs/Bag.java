package practice.graphs;

import java.util.Iterator;

/**
 * created by tianfeng on 2018/9/11
 * 背包
 */
public class Bag<Item> implements Iterable<Item>{
    private Node first;
    private class Node{
        Item item;
        Node next;
    }
    public void add(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item=item;
        first.next=oldfirst;
    }
    public Iterator<Item> iterator(){
        return new ListIterator();
    }
    private class ListIterator implements Iterator<Item>{
        private Node current = first;
        public boolean hasNext(){
            return current!=null;
        }
        public Item next(){
            Item item = current.item;
            current=current.next;
            return item;
        }
    }
}
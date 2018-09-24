package practice.search;

/**
 * created by tianfeng on 2018/9/5
 */
public class BST {
    private Node root;

    //节点内部类
    private class Node{
        private int key;
        private int value;
        Node left,right;
        public Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }


    //递归put实现
    public void put(int key,int value){
        root = put(root,key,value);
    }
    private Node put(Node root,int key,int value){
        if (root==null)return new Node(key,value);
        if (key>root.key)root.right = put(root.right,key,value);
        else if (key<root.key)root.left = put(root.left,key,value);
        else root.value=value;
        return root;
    }


    //递归get实现
    public int get(int key){
        return get(root,key);
    }
    private int get(Node root,int key){
        if (root==null)return -1;//-1代表没找到，实际中value应该是一个泛型，返回Null
        if (key>root.key)return get(root.right,key);
        else if (key<root.key)return get(root.left,key);
        else return root.value;
    }

    //get非递归实现
    public int get(int key,boolean notrecursion){
        Node x=root;
        while (x!=null){
            if (x.key==key){
                return x.value;
            }else if (key>x.key){
                x=root.right;
            }else {
                x=root.left;
            }
        }
        return -1;
    }

    //put的非递归实现
    public void put(int key,int value,boolean notrecursion){
        if (root==null)root = new Node(key,value);
        Node x = root;
        Node xfather=null;//x的父结点，当x为null是，成为新节点的父结点
        while (x!=null){
            if (key == x.key){
                x.value = value;
                return;
            }else if (key<x.key){
                xfather=x;
                x=x.left;
                if (x==null)xfather.left=new Node(key,value);
            }else {
                xfather=x;
                x= x.right;
                if (x==null)xfather.right = new Node(key,value);
            }
        }
    }

    public void deleteMin(){
        root = deleteMin(root);
    }
    private Node deleteMin(Node root){
        if (root.left==null)return root.right;
        root.left = deleteMin(root.left);
        return root;
    }

    public void delete(int key){
        root = delete(root,key);
    }
    private Node delete(Node x,int key){
        if (x==null)return null;
        if (x.key>key)return delete(x.left,key);
        else if (x.key<key)return delete(x.right,key);
        else {
            if (x.right==null)return x.left;
            if (x.left==null)return x.right;
            Node t = x;
            x=min(t.right);
            x.right=deleteMin(root.right);
            x.left=t.left;

        }
        return x;
    }
    private Node min(Node root){
        if (root==null)return null;
        Node x = root;
        while (root!=null){
            x = root;
            root = root.left;
        }
        return x;
    }
}

package practice.digraph;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * created by tianfeng on 2018/9/14
 * 基于深度优先搜索的顶点排序
 */
public class DepthFirstOrder{
    private boolean[] marked;
    private Queue<Integer> pre;                 //所有顶点的前序排序
    private Queue<Integer> post;                //所有顶点的后序排序
    private Stack<Integer> reversePost;         //。。逆后序排序
    public DepthFirstOrder(Digraph digraph){
        pre = new LinkedBlockingQueue<Integer>();
        post = new LinkedBlockingQueue<Integer>();
        reversePost = new Stack<Integer>();
        marked = new boolean[digraph.V()];
        for (int i =0;i<digraph.V();i++){
            if (!marked[i])dfs(digraph,i);
        }
    }
    private void dfs(Digraph g,int v){
        pre.add(v);
        marked[v] = true;
        for (int w :
                g.adj(v)) {
            if (!marked[w]) dfs(g, w);
        }
        post.add(v);
        reversePost.push(v);
    }
    public Iterable<Integer> reversePost(){
        return reversePost;
    }
}

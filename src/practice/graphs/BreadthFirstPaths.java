package practice.graphs;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * created by tianfeng on 2018/9/11
 * 广度优先搜索
 */
public class BreadthFirstPaths {
    private boolean[] marked;
    private final int s;
    private int[] edgeTo;
    public BreadthFirstPaths(Graph g,int s){
        this.s=s;
        marked = new boolean[g.V()];
        edgeTo = new int[g.V()];
    }
    private void bfs(Graph g,int v){
        Queue<Integer> queue = new LinkedBlockingQueue<Integer>();
        marked[v]=true;
        queue.add(v);
        while (!queue.isEmpty()){
            int w = queue.remove();
            for (int ss :
                    g.adj(w)) {
                if (!marked[ss]) {
                edgeTo[ss]=w;
                queue.add(ss);
                }
        }
    }
    }
    public boolean hasPathTo(int v){
        return marked[v];
    }
    public Iterable<Integer> pathTo(int v){
        if (!marked[v]) return null;
        Stack<Integer> path = new Stack<>();
        for (int i=v;i!=s;i=edgeTo[i]){
            path.push(i);
        }
        path.push(s);
        return path;
    }

}

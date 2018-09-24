package practice.graphs;

import java.util.Stack;

/**
 * created by tianfeng on 2018/9/11
 * 深度优先搜索，路径搜索
 */
public class DeepFirstPath {
    private final int s;
    private boolean[] marked;
    private int[] edgeTo;
    public DeepFirstPath(Graph g,int s){
        this.s=s;
        marked = new boolean[g.V()];
        edgeTo = new int[g.V()];

    }
    private void dfs(Graph g,int v){
        marked[v] = true;
        for (int w :
                g.adj(v)) {
            if (!marked[v]){
                edgeTo[w] = v;
                dfs(g,w);
            }
        }
    }
    public boolean hasPathTo(int v){
        return marked[v];
    }
    public Iterable<Integer> pathTo(int v){
        if (!hasPathTo(v))return null;
        Stack<Integer> path = new Stack<>();
        for (int i = v;i!=s;i=edgeTo[i]){
            path.push(i);
        }
        path.push(s);
        return path;
    }
}

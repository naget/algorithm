package practice.digraph;

import java.util.Stack;

/**
 * created by tianfeng on 2018/9/14
 * 检测有向环
 */
public class DirectedCycle {
    private boolean[] marked;
    private int[] edgeTo;
    private boolean[] onStack;
    private Stack<Integer> cycle;
    public DirectedCycle(Digraph g){
        onStack = new boolean[g.V()];
        edgeTo = new int[g.V()];
        marked = new boolean[g.V()];
        for (int i=0;i<g.V();i++){
            if (!marked[i])dfs(g,i);
        }
    }
    private void dfs(Digraph g,int v){
        marked[v] = true;
        onStack[v] = true;
        for (int w:
             g.adj(v)) {
            if (hasCycle())return;
            else if (!marked[w]){
                edgeTo[w]=v;
                dfs(g,w);
            }
            else if (onStack[w]){
                cycle = new Stack<Integer>();
                for (int i = v;i!=w;i=edgeTo[i]){
                    cycle.add(i);
                }
                cycle.add(w);
                cycle.add(v);
            }

        }
        onStack[v] = false;
    }
    public boolean hasCycle(){
        return cycle!=null;
    }
    public Iterable<Integer> cycle(){
        return cycle;
    }
}

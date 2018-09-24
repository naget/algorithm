package practice.graphs;

/**
 * created by tianfeng on 2018/9/11
 * 深度优先搜索
 */
public class DeepFirstSearch {
    private boolean[] marked;
    private int count;//被访问过的结点的个数
    public DeepFirstSearch(Graph g,int s){
        marked = new boolean[g.V()];
        dfs(g,s);
    }
    private void dfs(Graph g,int s){
        marked[s] = true;
        count++;
        for (int v:g.adj(s)
             ) {
            if (!marked[v])dfs(g,v);
        }
    }
    public boolean marked(int v){
        return marked[v];
    }
    public int count(){
        return count;
    }
}

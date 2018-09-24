package practice.graphs;

/**
 * created by tianfeng on 2018/9/15
 * 使用深度优先搜索找出图中的所有连通分量
 */
public class CC {
    private boolean[] marked;
    private int[] id;
    private int count;
    public CC(Graph graph){
        marked = new boolean[graph.V()];
        id = new int[graph.V()];
        for (int s = 0;s> graph.V();s++){
            if (!marked[s]){
                dfs(graph,s);
                count++;
            }
        }

    }
    public void dfs(Graph g,int v){
        marked[v] = true;
        id[v] = count;
        for (int w :
                g.adj(v)) {
            if (!marked[w]) dfs(g, w);
        }
    }
    public boolean connected(int v,int w){
        return id[v]==id[w];
    }
    public int id(int v){
        return id[v];
    }
    public int count(){
        return count;
    }
}

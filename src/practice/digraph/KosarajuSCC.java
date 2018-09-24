package practice.digraph;

/**
 * created by tianfeng on 2018/9/14
 * 计算强连通分量的Kosaraju算法
 */
public class KosarajuSCC {
    private boolean[] marked;
    private int[] id;
    private int count;
    public KosarajuSCC(Digraph digraph){
        marked = new boolean[digraph.V()];
        id = new int[digraph.V()];
        count = 0;
        DepthFirstOrder order = new DepthFirstOrder(digraph.reverse());
        for (int v :
                order.reversePost()) {
            if (!marked[v]){
                dfs(digraph,v);
                count++;
            }

        }

    }
    private void dfs(Digraph digraph,int v){
        marked[v] = true;
        id[v] = count;
        for (int w :
                digraph.adj(v)) {
            if (!marked[w])dfs(digraph,w);
        }
    }
    public boolean stronglyConnected(int v,int w){
        return id[v]==id[w];
    }
    public int id(int v){
        return id[v];
    }
    public int count(){
        return count;
    }
}

package practice.graphs.minimumMpanningTree;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * created by tianfeng on 2018/9/24
 * 最小生成树演示版本
 */
public class LazyPrimMST {
    private boolean[] marked;
    private Queue<Edge> mst;
    private MinPQ<Edge> pq;
    public LazyPrimMST(EdgeWeightedGraph G){
        pq = new MinPQ<>(G.E());
        marked = new boolean[G.V()];
        mst = new LinkedBlockingQueue<Edge>();

        visit(G,0);
        while (!pq.isEmpty()){
            Edge e = pq.delMin();
            int v = e.either(),w = e.other(v);
            if (marked[v]&&marked[w])continue;
            mst.add(e);
            if (!marked[v])visit(G,v);
            if (!marked[w])visit(G,v);
        }
    }
    private void visit(EdgeWeightedGraph G,int v){
        marked[v] = true;
        for (Edge w :
                G.adj(v)) {
            if (!marked[w.other(v)])pq.insert(w);

        }
    }
    public Iterable<Edge> edges(){
        return mst;
    }
}

package practice.graphs.minimumMpanningTree;

import practice.graphs.Bag;

/**
 * created by tianfeng on 2018/9/24
 * 加权无向图
 */
public class EdgeWeightedGraph {
    private final int V;
    private int E;
    private Bag<Edge>[] adj;
    public EdgeWeightedGraph(int V){
        this.V = V;
        this.E = 0;
        adj = (Bag<Edge>[]) new Bag[V];
        for (int i = 0;i<V;i++){
            adj[i] = new Bag<Edge>();
        }
    }
    public int V(){
        return V;
    }
    public int E(){
        return E;
    }
    public void addEdge(Edge e){
        int v = e.either(),w = e.other(v);
        adj[v].add(e);
        adj[w].add(e);
        E++;
    }
    public Iterable<Edge> adj(int v){
        return adj[v];
    }
    public Iterable<Edge> edges(){
        Bag<Edge> bag = new Bag<Edge>();
        for (int v = 0;v<V();v++){
            for (Edge j :
                    adj[v]) {
                if (v<j.other(v))bag.add(j);
            }
        }
        return bag;

    }
}

package practice.digraph.ShortestPath;

import practice.graphs.Bag;

/**
 * created by tianfeng on 2018/9/25
 *
 */
public class EdgeWeightedDigraph {
    private final int V;
    private int E;
    private Bag<DirectedEdge>[] adj;
    public EdgeWeightedDigraph(int V){
        this.V = V;
        this.E = 0;
        adj = (Bag<DirectedEdge>[]) new Bag[V];
        for (int v = 0;v<V;v++){
            adj[v] = new Bag<DirectedEdge>();
        }
    }
    public int V(){
        return V;
    }
    public int E(){
        return E;
    }
    public void addEdge(DirectedEdge e){
        adj[e.from()].add(e);
        E++;
    }
    public Iterable<DirectedEdge> adj(int v){
        return adj(v);
    }
    public Iterable<DirectedEdge> edges(){
        Bag<DirectedEdge> bag = new Bag<DirectedEdge>();
        for (int v = 0;v<V;v++){
            for (DirectedEdge e :
                    adj[v]) {
                bag.add(e);
            }
        }
        return bag;
    }
}

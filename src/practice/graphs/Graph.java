package practice.graphs;

import lib.In;

/**
 * created by tianfeng on 2018/9/11
 */
public class Graph {
    private final int V;//顶点数
    private int E;      //边数
    private Bag<Integer>[] adj;//邻接表
    public Graph(int V){
        this.V=V;
        this.E=0;
        adj = (Bag<Integer>[]) new Bag[V];
        for (int i=0;i<V;i++){
            adj[i]=new Bag<Integer>();
        }
    }
    public Graph(In in){
        this(in.readInt());
        this.E=in.readInt();
        for (int i=0;i<V;i++){
            int w = in.readInt();
            int v = in.readInt();

        }

    }
    public int V(){
        return V;
    }
    public int E(){
        return E;
    }
    public void addEdge(int v,int w){
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }
    public Iterable<Integer> adj(int v){
        return adj[v];
    }
}

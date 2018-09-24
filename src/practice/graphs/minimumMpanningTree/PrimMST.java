//package practice.graphs.minimumMpanningTree;
//
///**
// * created by tianfeng on 2018/9/24
// */
//public class PrimMST {
//    private Edge[] edgeTo;
//    private double[] distTo;
//    private MinPQ<Double> pq;
//    private boolean[] marked;
//
//    public PrimMST(EdgeWeightedGraph G){
//        distTo  = new double[G.V()];
//        edgeTo = new Edge[G.V()];
//        pq = new MinPQ<>(G.V());

//        for (int v =0;v<G.V();v++){
//            distTo[v] = Double.POSITIVE_INFINITY;
//        }
//        pq = new MinPQ<Double>(G.V());
//        distTo[0] = 0.0;
//        pq.insert(0,0.0);
//    }
//}

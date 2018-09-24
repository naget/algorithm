package practice.graphs.minimumMpanningTree;

/**
 * created by tianfeng on 2018/9/24
 */
public class MinPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N = 0;
    public MinPQ(int maxN){
        pq = (Key[]) new Comparable[maxN+1];
    }
    public boolean isEmpty(){
        return N==0;
    }
    public int size(){
        return N;
    }
    public void insert(Key v){
        pq[++N] = v;
        swim(N);
    }
    public Key delMin(){
        Key min = pq[1];
        exch(1,N--);
        pq[N+1] = null;
        sink(1);
        return min;
    }
    private void swim(int n){
        while (n>1&&less(n,n/2)){
            exch(n,n/2);
            n=n/2;
        }
    }
    private void sink(int n){
        while (2*n<=N){
            int j = 2*n;
            if (j<N&&less(j+1,j))j++;
            if(!less(j,n))break;
            exch(n,j);
            n=j;
        }
    }
    private boolean less(int i,int j){
       return pq[i].compareTo(pq[j])<0;
    }
    private void exch(int i,int j){
        Key t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }
}

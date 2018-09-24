package algorithmC1;

/**
 * Created by tianfeng on 2018/2/11.
 */
public class Q1513WeightedQuickUnionUF {
    private int[] id;
    private int[] sz;
    private int count;
    public Q1513WeightedQuickUnionUF(int N){
        count = N;
        id  = new int[N];
        for (int i = 0;i<N;i++){
            id[i] = i;
        }
        sz = new int[N];
        for (int i = 0;i<N;i++) sz[i]=1;
    }
    public int count(){
        return count;
    }
    public boolean connected(int p,int q){
        return find(p)==find(q);
    }
    private int find(int p){
        while (p != id[p])p = id[p];
        return p;
    }
    public void union(int p,int q){
        int j = find(p);
        int i = find(q);
        if (i == j) return;
        if (sz[i]<sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        }
        else {
            id[j] = i;
            sz[i] += sz[j];
        }
        count--;
    }
}

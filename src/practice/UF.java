package practice;

/**
 * Created by tianfeng on 2018/2/18.
 */
public class UF {
    private int[] id;//分量id
    private int count;//分量数量
    public UF(int N){
        count = N;
        id = new int[N];
        for (int  i=0;i<N;i++){
            id[i] = i;
        }
    }
    public int count(){
        return count;
    }
    public boolean connected(int p,int q){
        return find(p) == find(q);
    }
    public int find(int i){
        return id[i];
    }
    public void union(int p,int q){
        int pID = find(p);
        int qID = find(q);
        if (pID == qID)return;
        for (int  i=0;i<id.length;i++){
            if (id[i]==pID) id[i]=qID;
        }
        count--;
    }

    public static void main(String[] args) {
        int[] array = {0,4,2,14,1,5,6,11,8,9,10,7,12,15,3,13,3,9};
        UF uf = new UF(16);
        for (int i = 0;i<array.length-1;i=i+2){
            if (uf.connected(array[i],array[i+1])) continue;
            uf.union(array[i],array[i+1]);
            System.out.println("union"+array[i]+"and"+array[i+1]);
        }
        System.out.println("共"+uf.count()+"个连通分量");
    }

}

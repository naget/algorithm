package practice;

/**
 * Created by tianfeng on 2018/2/19.
 */
public class quickunionUF {
    private int[] id;//分量id
    private int count;//分量数量
    public quickunionUF(int N){
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
        while (i!=id[i]) i = id[i];//寻找根节点
        return i;
    }
    public void union(int p,int q){
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot==qRoot) return;
        id[pRoot] = qRoot;//将一棵树作为子树连到另一颗树上
        count--;
    }

    public static void main(String[] args) {
        int[] array = {4,3,3,8,6,5,9,4,2,1,8,9,5,0,7,2,6,1,1,0,6,7};
        UF uf = new UF(10);
        for (int i = 0;i<array.length-1;i=i+2){//A
            if (uf.connected(array[i],array[i+1])) continue;
            uf.union(array[i],array[i+1]);
            System.out.println("union"+array[i]+"and"+array[i+1]);
        }
        System.out.println("共"+uf.count()+"个连通分量");
    }
}

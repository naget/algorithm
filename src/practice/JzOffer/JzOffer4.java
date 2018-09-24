package practice.JzOffer;

/**
 * Created by tianfeng on 2018/3/20.
 * 根据二叉树的前序遍历和中序遍历重现二叉树
 */
public class JzOffer4 {
    public BinaryTree getTree(int[] pre,int[] in){
        return getTree(pre,0,pre.length-1,in,0,in.length-1);
    }

    private BinaryTree getTree(int[] pre, int prestart, int preend, int[] in, int instart, int inend) {
        if (prestart>preend||instart>inend)return null;
        BinaryTree root = new BinaryTree(pre[prestart]);
        for (int i=instart;i<=inend;i++){
            if (pre[prestart]==in[i]){
                root.left=getTree(pre,prestart+1,i-instart+prestart,in,instart,i-1);
                root.right = getTree(pre,i-instart+prestart+1,preend,in,i+1,inend);
                break;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        JzOffer4  j = new JzOffer4();
        int[] a = {1,2,4,7,3,5,6,8};
        int[] b = {4,7,2,1,5,3,8,6};
        BinaryTree binaryTree = j.getTree(a,b);
        printTree(binaryTree);
    }
    public static void printTree(BinaryTree binaryTree){
        if (binaryTree==null)return;
        System.out.print(binaryTree.val+" ");
        printTree(binaryTree.left);
        printTree(binaryTree.right);
    }

    class BinaryTree{
        int val;
        BinaryTree left;
        BinaryTree right;
        public BinaryTree(int a){
            this.val=a;
        }
    }
}

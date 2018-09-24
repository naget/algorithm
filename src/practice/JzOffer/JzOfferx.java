package practice.JzOffer;

/**
 * Created by tianfeng on 2018/3/26.
 */
public class JzOfferx {

        public static boolean result=false;
        public boolean HasSubtree(TreeNode root1,TreeNode root2) {
            if(root1 != null&&root2!=null){
                if(root1==root2) result=true;
                if(!result) result = HasSubtree(root1.left,root2);
                if(!result) result = HasSubtree(root2.left,root2);
            }

            return result;
        }
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

        }
}

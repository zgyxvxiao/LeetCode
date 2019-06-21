package dfs;

import javax.swing.tree.TreeNode;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        int sum = 0;
        return traverse(root, sum);

    }

    public int traverse(TreeNode root, int sum ){
        if(root == null){
            return sum;
        }
        sum += 1;
        return Math.max(traverse(root.left, sum), traverse(root.right, sum)) ;
    }
}

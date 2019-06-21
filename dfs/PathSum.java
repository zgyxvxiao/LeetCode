package dfs;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        boolean result = false;
        if(root == null){
            return false;
        }
        result = traverse(root, sum);
        return result;
    }
    public boolean traverse(TreeNode root, int sum){
        boolean result = false;
        if(root == null){
            if(sum == 0){
                return true;
            }
        }

        sum -= root.val;
        result = traverse(root.left, sum);
        if(result != true) {
            result = traverse(root.right, sum);
        }
        return result;
    }
}

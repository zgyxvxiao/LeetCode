package dfs;

import javax.swing.tree.TreeNode;
import java.util.Stack;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        return traverse(root.left, root.right);
    }

    public boolean traverse(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }

        return traverse(left.left, right.right) && traverse(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        return traverse(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode root) {
        boolean result = true;
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        if (root == null) {
            return true;
        }

        stack1.push(root.left);

        stack2.push(root.right);

        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            TreeNode node1 = stack1.pop();
            TreeNode node2 = stack2.pop();

            if (node1 == null && node2 == null) {
                result = true;
                continue;
            }

            if (node1 == null || node2 == null) {
                result = false;
                break;
            }
            if (node1.val != node2.val) {
                result = false;
                break;
            }
            //if(node1.right != null){
            stack1.push(node1.right);
            //}
            //if(node1.left != null){
            stack1.push(node1.left);
            //}
            //if(node2.left != null){
            stack2.push(node2.left);
            //}
            //if(node2.right != null){
            stack2.push(node2.right);
            //}
        }
        return result;
    }
}

package BFS;

import javax.swing.tree.TreeNode;
import java.util.*;

public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result =  new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root != null)
            queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();
                if(node.left != null){
                    queue.offer(node.left);
                    list.add(node.left.val);
                }
                if(node.right != null){
                    queue.offer(node.right);
                    list.add(node.right.val);
                }
            }
            if(list.size() != 0)
                result.add(list);
        }

        List<Integer> rootList = new ArrayList<Integer>();
        rootList.add(root.val);
        result.add(0, rootList);

        Collections.reverse(result);
        return result;

    }
}

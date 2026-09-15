/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        
        if (root == null)
            return ans;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        boolean leftToRight = true;
        
        while (!q.isEmpty()) {
            
            int size = q.size();
            List<Integer> curr = new ArrayList<>();
            
            for (int i = 0; i < size; i++) {
                
                TreeNode temp = q.remove();
                curr.add(temp.val);
                
                if (temp.left != null)
                    q.add(temp.left);
                
                if (temp.right != null)
                    q.add(temp.right);
            }
            
            if (!leftToRight)
                Collections.reverse(curr);
            
            ans.add(curr);
            
            leftToRight = !leftToRight;
        }
        
        return ans;
    }
}
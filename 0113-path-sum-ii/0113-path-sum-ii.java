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
    List<List<Integer>> ans=new ArrayList<>();
    ArrayList<Integer> path=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        solve(root,target);
        return ans;
    }
    void solve(TreeNode root, int target){
        if(root==null)return;
        path.add(root.val);
        target=target-root.val;
        if(target == 0 && root.left == null && root.right == null) {
            ans.add(new ArrayList<>(path));
        }
        solve(root.left,target);
        solve(root.right,target);
        path.remove(path.size()-1);
    }
}
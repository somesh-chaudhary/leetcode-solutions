/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)return null;
        if(root==p || root==q)return root;
        boolean pLiesInLeft=exists(root.left,p);
        boolean qLiesInLeft=exists(root.left,q);
        if(pLiesInLeft && qLiesInLeft)return lowestCommonAncestor(root.left,p,q);
        if(!pLiesInLeft && !qLiesInLeft)return lowestCommonAncestor(root.right,p,q);
        else return root;
    }
    private boolean exists(TreeNode root,TreeNode val){
        if(root==null)return false;
        if(root==val) return true;
        return exists(root.left, val) || exists(root.right, val);
    }
}
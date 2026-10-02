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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return LCA(root);
    }
    public TreeNode LCA(TreeNode root){
        if(root==null)return null;
        int leftdepth=getdepth(root.left);
        int rightdepth=getdepth(root.right);
        if(leftdepth==rightdepth)return root;
        if(leftdepth>rightdepth)return LCA(root.left);
        if(leftdepth<rightdepth)return LCA(root.right);
        else return LCA(root.right);
    }
    public int getdepth(TreeNode node){
        if(node==null)return 0;
        int left=getdepth(node.left);
        int right=getdepth(node.right);
        return 1+Math.max(left,right);
    }
}
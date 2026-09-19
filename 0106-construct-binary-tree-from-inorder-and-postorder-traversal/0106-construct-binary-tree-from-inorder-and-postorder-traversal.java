class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=postorder.length;
        return build(0,n-1,0,n-1,postorder,inorder);
    }
    public TreeNode build(int postLo,int postHi,int inLo,int inHi,int[] postorder,int[] inorder){
        if(postLo>postHi)return null;
        int d=postorder[postHi];
        TreeNode root=new TreeNode(d);
        int r=0;
        for(int i=inLo;i<=inHi;i++){
            if(inorder[i]==d){
                r=i;
                break;
            }
        }
        int cnt=r-inLo;
        root.left=build(postLo,postLo+cnt-1,inLo,r-1,postorder,inorder);
        root.right=build(postLo+cnt,postHi-1,r+1,inHi,postorder,inorder);
        return root;
    }
}
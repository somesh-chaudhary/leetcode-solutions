class Triplet{
    int max;
    int min;
    int sum;
    boolean isbst;
    Triplet(int max,int min,int sum,boolean isbst){
        this.max=max;
        this.min=min;
        this.sum=sum;
        this.isbst=isbst;
    }
}
class Solution {
    int maxsum=0;
    public int maxSumBST(TreeNode root) {
        maxmin(root);
        return maxsum;
    }
    Triplet maxmin(TreeNode root){
        if(root==null)return new Triplet(Integer.MIN_VALUE,Integer.MAX_VALUE,0,true);
        Triplet lst=maxmin(root.left);
        Triplet rst=maxmin(root.right);
        int max=Math.max(root.val,Math.max(lst.max,rst.max));
        int min=Math.min(root.val,Math.min(lst.min,rst.min));
        boolean isbst=lst.isbst && rst.isbst && (lst.max<root.val) && (rst.min>root.val);
        int sum=0;
        if(isbst)sum=lst.sum+root.val+rst.sum;
        maxsum=Math.max(maxsum,sum);
        return new Triplet(max,min,sum,isbst);
    }
}
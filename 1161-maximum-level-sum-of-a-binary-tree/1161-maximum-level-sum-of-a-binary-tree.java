class Solution {
    public int maxLevelSum(TreeNode root) {
        if(root==null)return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=1;
        int maxsum=Integer.MIN_VALUE;
        int ans=1;
        while(!q.isEmpty()){
            int sum=0;
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode temp=q.remove();
                sum+=temp.val;
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
            }
            if(sum>maxsum){
                maxsum=sum;
                ans=level;
            }
            level++;
        }
        return ans;
        
    }
}
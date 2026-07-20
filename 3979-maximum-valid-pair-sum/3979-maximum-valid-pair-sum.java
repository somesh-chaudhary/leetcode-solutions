class Solution {
    public int maxValidPairSum(int[] a, int k) {

        int mx=-1,ans=-1;

        for(int j=k;j<a.length;j++){
            mx=Math.max(mx,a[j-k]);
            ans=Math.max(ans,mx+a[j]);
        }
        return ans;
    }
}
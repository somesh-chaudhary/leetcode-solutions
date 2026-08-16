class Solution {
    public int minOperations(String s) {
        int n=s.length(),ans=Integer.MAX_VALUE;
        for(int r=0;r<n;r++){
            int op=r;
            for(int i=0;i<n/2;i++){
                int c1=s.charAt((i+r)%n);
                int c2=s.charAt((n-1-i+r)%n);
                int d1=(c2-c1+26)%26;
                int d2=(c1-c2+26)%26;
                op+=Math.min(d1,d2);
            }
            ans=Math.min(ans,op);
        }
        return ans;
    }
}
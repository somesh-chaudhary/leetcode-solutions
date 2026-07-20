class Solution {
    long MOD=1000000007;
    public int minimumCost(int[] nums, int k) {
        long r=k;
        long ops=0;
        long c=0;

        for(int x:nums){
            if(r<x){
                long d=x-r;
                long m=(d+k-1)/k;
                long newops=ops+m;
                long costAdded=(getSum(newops)-getSum(ops)+MOD)%MOD;
                c=(c+costAdded)%MOD;
                r=r+(m*k);
                ops=newops;
            }
            r=r-x;
        }
        return (int)c;
    }
     private long getSum(long n){
        long a=n%MOD;
        long b=(n+1)%MOD;
        return (a*b%MOD)*500000004L%MOD;
    }
}
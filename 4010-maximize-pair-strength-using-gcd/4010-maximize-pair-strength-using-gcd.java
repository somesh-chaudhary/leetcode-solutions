class Solution {
    public long maxPairStrength(int[] nums) {

        int n=nums.length;
        long max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long a=nums[i];
                long b=nums[j];
                long g=gcd(a,b);
                long strength=(a*b)/(g*g);
                max=Math.max(max,strength);
            }
        }
        return max;
        
    }
    private long gcd(long a,long b){
        return b==0 ?a:gcd(b,a%b);
    }
}
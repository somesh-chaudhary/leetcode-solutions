class Solution {
    static Boolean[][] dp;
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0)return false;
        //if(sum%2==0)
        return subset(nums,sum/2);
    }
    static boolean subset(int arr[],int sum){
        int n=arr.length;
        dp = new Boolean[n + 1][sum + 1];
        return solve(arr,sum,n);
    }
    static boolean solve(int arr[],int sum,int n){
        if(sum==0)return true;
        if(n==0)return false;
        if(dp[n][sum]!=null)return dp[n][sum];
        if(arr[n-1]<=sum)dp[n][sum]=solve(arr, sum - arr[n - 1], n - 1)|| solve(arr, sum, n - 1);
        else{
            dp[n][sum] = solve(arr, sum, n - 1);
        }

        return dp[n][sum];
    }
}
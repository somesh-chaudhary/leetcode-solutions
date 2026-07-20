class Solution {
    public int maximumCandies(int[] candies, long k) {

        int max=0;
        for(int candy:candies) max=Math.max(max,candy);

        int left=1;
        int right=max;
        int ans=0;

        while(left<=right){
            int mid=left+(right-left)/2;
            long child=0;
            for(int candy:candies){
                child+=candy/mid;
            }
            if(child>=k){
                ans=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }

        return ans;
        
    }
}
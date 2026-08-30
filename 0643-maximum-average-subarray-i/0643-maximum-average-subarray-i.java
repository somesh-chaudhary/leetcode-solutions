class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int avg=0;
        int max;
        for(int i=0;i<k;i++){
            avg+=nums[i];
        }
        max=avg;
        for(int i=k;i<nums.length;i++){
            avg+=nums[i];
            avg-=nums[i-k];
            max=Math.max(max,avg);
        }
        return (double)max/k;
    }
}
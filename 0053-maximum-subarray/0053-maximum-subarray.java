class Solution {
    public int maxSubArray(int[] nums) {


        int max = Integer.MIN_VALUE;
        int cur_max = 0;

        

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            cur_max+=nums[i];
            max=Math.max(cur_max,max);
            if(cur_max<0) cur_max=0;

        
        }

        return max;

    }
}
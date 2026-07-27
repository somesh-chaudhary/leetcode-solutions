class Solution {
    public int maxProduct(int[] nums) {

        int max1=0;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int pr=(nums[i]-1)*(nums[j]-1);
                max1 =Math.max(pr,max1);
            }
        }

        return max1;
        
    }
}
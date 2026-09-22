class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int i=0,j=0;
        long result=0;
        long currsum=0;
        HashSet<Integer> set=new HashSet<>();
        while(j<nums.length){
            while(set.contains(nums[j])){
                currsum-=nums[i];
                set.remove(nums[i]);
                i++;
            }
            currsum+=nums[j];
            set.add(nums[j]);
            if(j-i+1==k){
                result=Math.max(result,currsum);
                currsum-=nums[i];
                set.remove(nums[i]);
                i++;
            }
            j++;
        }
        return result;
    }
}
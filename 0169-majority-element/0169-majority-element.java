class Solution {
    public int majorityElement(int[] nums) {
        for(int first:nums){
            int freq=0;
            int t=nums.length/2;
            for(int sec:nums){
                if(first==sec)freq++;
            }
            if(freq>t)return first;
        }
        return -1;
    }
}
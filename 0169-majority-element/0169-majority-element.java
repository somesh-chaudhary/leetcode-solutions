class Solution {
    public int majorityElement(int[] nums) {
        int ans=0;
        int balance=0;
        for(int value:nums){
            if(balance==0)ans=value;
            if(value==ans)balance++;
            else balance--;
        }
        return ans;
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        int ans=0;
        int balance=0;
        for(int ele:nums){
            if(balance==0)ans=ele;
            if(ans==ele)balance++;
            else balance--;
        }
        return ans;
    }
}
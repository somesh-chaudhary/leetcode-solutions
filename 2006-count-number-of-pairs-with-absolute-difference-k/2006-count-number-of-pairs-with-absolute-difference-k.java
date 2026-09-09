class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int ele : nums){
            ans+=map.getOrDefault(ele-k,0);
            ans+=map.getOrDefault(ele+k,0);
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        return ans;
    }
}
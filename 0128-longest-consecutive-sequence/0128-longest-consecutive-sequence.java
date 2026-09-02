class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        int longest=0;
        for(int ele:set){
            if(!set.contains(ele-1)){
                int count=1;
                int x=ele;
                while(set.contains(x+1)){
                    x++;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}
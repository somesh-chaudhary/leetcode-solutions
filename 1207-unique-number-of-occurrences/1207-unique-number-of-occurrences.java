class Solution {
    public boolean uniqueOccurrences(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashSet<Integer> set=new HashSet<>();
        for(int count:map.values()){
            if(set.contains(count))return false;
            set.add(count);
        }
        return true;
    }
}
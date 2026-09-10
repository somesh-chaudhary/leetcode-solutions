class Solution {
    public boolean canArrange(int[] nums, int k) {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int num : nums){
            int rem=num%k;
            if(rem<0)rem+=k;
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        if(map.getOrDefault(0,0)%2!=0)return false;
        for(int rem:map.keySet()){
            int need=(k-rem)%k;
            if(rem!=0 && rem*2!=k){
                if(!map.get(rem).equals(map.getOrDefault(need,0))) return false;
            }
        }
        if(k%2==0 && map.getOrDefault(k/2,0)%2!=0)return false;
        return true;
    }
}
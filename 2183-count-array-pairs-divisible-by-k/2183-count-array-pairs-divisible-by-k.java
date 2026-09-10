class Solution {
    public long countPairs(int[] nums, int k) {
        long count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            int g=gcd(num,k);
            for(int x:map.keySet()){
                if((long)x*g%k==0)count +=map.get(x);
            }
            map.put(g,map.getOrDefault(g,0)+1);
        }
        return count;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}
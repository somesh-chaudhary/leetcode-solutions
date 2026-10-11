class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b)->{
                if(a[0]!=b[0])return b[0]-a[0];
                return b[1]-a[1];
            }
        );
        for(int i=0;i<arr.length;i++){
            int diff=Math.abs(arr[i]-x);
            pq.add(new int[]{diff,arr[i]});
            if(pq.size()>k)pq.remove();
        }
        List <Integer> ans=new ArrayList<>();
        while(pq.size()!=0){
            ans.add(pq.remove()[1]);
        }
        Collections.sort(ans);
        return ans;
    }
}
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {

        int []passanger=new int[1001];
        for(int []trip:trips){
            int count =trip[0];
            int from=trip[1];
            int to=trip[2];
            passanger[from] += count;
            passanger[to] -= count;
        }
        int cur=0;
        for(int i=0;i<1000;i++){
            cur+=passanger[i];
            if(cur>capacity)return false;
        }
        return true;
        
    }
}
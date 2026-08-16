class Solution {
    public int elevatorRequests(int n, int[] requests) {

        int c=0,t=0;
        for(int r:requests){
            t+=Math.abs(r-c);
            c=r;
        }
        return t;
        
    }
}
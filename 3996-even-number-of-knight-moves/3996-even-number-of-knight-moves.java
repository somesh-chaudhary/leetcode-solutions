class Solution {
    public boolean canReach(int[] start, int[] target) {

        int st=start[0]+start[1];
        int tt=target[0]+target[1];
        return  (st%2) == (tt%2);
        
    }
}
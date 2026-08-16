class Solution {
    public int nearestDrone(int[][] drs, int[] tgt) {
        int idx=-1,min=Integer.MAX_VALUE;
        for(int i=0;i<drs.length;i++){
            int d=Math.abs(drs[i][0]-tgt[0])+Math.abs(drs[i][1]-tgt[1]);
            if(d<=drs[i][2]&&d<min){
                min=d;
                idx=i;
            }
        }
        return idx;
    }
}
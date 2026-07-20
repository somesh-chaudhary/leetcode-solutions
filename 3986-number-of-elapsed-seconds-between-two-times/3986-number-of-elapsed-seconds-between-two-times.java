class Solution {
    public int secondsBetweenTimes(String start, String end) {

        return getsec(end)-getsec(start);
    }
    private int getsec(String time){
        String[] t =time.split(":");
        int h=Integer.parseInt(t[0]);
        int m=Integer.parseInt(t[1]);
        int s=Integer.parseInt(t[2]);

        return (h*3600)+(m*60)+s;
    }
}
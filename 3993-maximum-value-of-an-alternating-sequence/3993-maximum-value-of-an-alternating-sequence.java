class Solution {
    public long maximumValue(int n, int s, int m) {

        if(n==1) return s;

        long up=n/2;
        long down=up-1;

        long max =(long)s+(up*(long)m)-down;

        return max;
        
    }
}
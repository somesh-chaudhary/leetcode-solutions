class Solution {
    public int maxProfit(int[] prices) {

        int minprice=prices[0];
        int maxprofir=0;
        for(int i=1;i<prices.length;i++){
            minprice=Math.min(minprice,prices[i]);
            int currprofit=prices[i]-minprice;
            maxprofir=Math.max(currprofit,maxprofir);
        }

        return maxprofir;
        
    }
}
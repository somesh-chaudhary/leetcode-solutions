class Solution {
    public int maxProfit(int[] prices) {

        int tp=0;
        int p=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                p=prices[i]-prices[i-1];
                tp+=p;
            }
        }

        return tp;
        
    }
}
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double total=0.0;
        int n=prices.length;
        int m=discounts.length;
        int p=n-1;
        int d=m-1;
        while(p>=0 && d>=0){
            total+=(double) prices[p]*(100-discounts[d])/100.0;
            p--;
            d--;
        }
        while(p>=0){
            total+=prices[p];
            p--;
        
        }
    return total;
        
    }
}
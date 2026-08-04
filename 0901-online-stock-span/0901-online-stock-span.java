class StockSpanner {

    class pair{
        int val;
        int idx;

        pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
    }

    Stack<pair> st;
    int idx;

    public StockSpanner() {

        st=new Stack<>();
        idx=0;
        
    }
    
    public int next(int price) {

        while(!st.isEmpty() && st.peek().val<=price)st.pop();
        int span;
        if(st.isEmpty()){
            span=idx+1;
        }else{
            span=idx-st.peek().idx;
        }
        st.push(new pair(price,idx));
        idx++;
        return span;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
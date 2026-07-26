class Solution {
    public int calPoints(String[] nums) {

        int n=nums.length;
        Stack <Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            String s=nums[i];
            if(s.equals("C"))st.pop();
            else if(s.equals("D"))st.push(st.peek()*2);
            else if(s.equals("+")){
                int top=st.pop();
                int stop=st.peek();
                int new1 =top+stop;
                st.push(top);
                st.push(new1);
            }else st.push(Integer.parseInt(s));
        }
        int sum=0;
        while(st.size()>0){
            sum+=st.pop();
        }
        return sum;
        
    }
}
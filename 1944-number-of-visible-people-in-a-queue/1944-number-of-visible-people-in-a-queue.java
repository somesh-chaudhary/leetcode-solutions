class Solution {
    public int[] canSeePersonsCount(int[] nums) {

        int n=nums.length;
        int [] ans=new int[n];
        Stack <Integer> st=new Stack<>();
        st.push(nums[n-1]);
        ans[n-1]=0;
        for(int i = n-2;i>=0;i--){
            int count=0;
            while(st.size()>0 && st.peek()<=nums[i]){
                count++;
                st.pop();
            }
            if(st.size()>0)count++;
            ans[i]=count;
            st.push(nums[i]);
        }
        return ans;
    }
}
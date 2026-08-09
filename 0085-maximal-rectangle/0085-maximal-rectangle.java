class Solution {
    public int largestRectangleArea(int[] nums) {
        int n=nums.length;
        int [] nse=new int[n];
        nse[n-1]=n;
        //next smallest no.
        Stack <Integer> st=new Stack<>();
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && nums[st.peek()]>=nums[i])st.pop();
            if(st.size()==0)nse[i]=n;
            else nse[i]=st.peek();
            st.push(i);
        }
        //prev. smallest no.
        while(st.size()>0)st.pop();
        int [] pse=new int[n];
        pse[0]=-1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(st.size()>0 && nums[st.peek()]>=nums[i])st.pop();
            if(st.size()==0)pse[i]=-1;
            else pse[i]=st.peek();
            st.push(i);
        }
        int maxarea=0;
        for(int i=0;i<n;i++){
            int area=nums[i]*(nse[i]-pse[i]-1);
            maxarea=Math.max(area,maxarea);
        }

        return maxarea;

    }
    public int maximalRectangle(char[][] matrix) {
        int m=matrix.length, n=matrix[0].length;
        int[] heights = new int[n];
        int max = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == '1') { 
                    heights[j] += 1;
                } else {
                    heights[j] = 0; 
                }
            }
            int area = largestRectangleArea(heights);
            max = Math.max(max, area);
        }
        return max;
    }
}
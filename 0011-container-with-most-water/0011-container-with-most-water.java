class Solution {
    public int maxArea(int[] height) {
        

        int max=0;
        int n=height.length;
        int i=0,j=n-1;

        while(i<j){
            int l=Math.min(height[i],height[j]);
            int w=j-i;
            int a=l*w;
            max=Math.max(max,a);
            if(height[i]<height[j])i++;
            else j--;
        }
        return max;
    }
}
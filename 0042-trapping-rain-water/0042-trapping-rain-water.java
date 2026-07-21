class Solution {
    public int trap(int[] nums) {

        int n = nums.length;
        int []leftmax=new int [n];
        int []rightmax=new int [n];

        leftmax[0]=nums[0];
        for(int i =1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],nums[i]);
        }
        rightmax[n-1]=nums[n-1];
        for(int i =n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],nums[i]);
        }
        int water=0;
        for(int i =0;i<n;i++){
            water+=Math.min(leftmax[i],rightmax[i])-nums[i];
        }
        return water;
        
    }
}
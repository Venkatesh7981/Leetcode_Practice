class Solution {
    public int maxArea(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int max=0;
       while(i<j){
            int wid=j-i;
            int min=Math.min(nums[i],nums[j]);
            int area=wid*min;
            max=Math.max(area,max);
            if(nums[i]<nums[j]) i++;
            else j--;
        }
        return max;
    }
}
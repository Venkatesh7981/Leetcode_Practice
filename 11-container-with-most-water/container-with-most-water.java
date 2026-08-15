class Solution {
    public int maxArea(int[] nums) {
        int max=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int wid=j-i;
            int min=Math.min(nums[i],nums[j]);
            int area=wid*min;
            max=Math.max(max,area);
           if(nums[i]>nums[j]){
            j--;
           }
           else i++;
        }
        return max;
    }
}
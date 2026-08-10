class Solution {
    public boolean canJump(int[] nums) {
       int las=nums.length-1;
       for(int i=nums.length-2;i>=0;i--){
        if(nums[i]+i>=las){
            las=i;
        }
       } 
       return las==0;
    }
}
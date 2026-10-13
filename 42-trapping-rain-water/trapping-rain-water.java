class Solution {
    public int trap(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int ans=0;
        int lm=0;
        int rm=0;
        while(i<j){
            lm=Math.max(lm,nums[i]);
            rm=Math.max(rm,nums[j]);
            int min=Math.min(lm,rm);
            if(nums[i]<nums[j]){
                ans+=min-nums[i];
                i++;
            }
            else{
                ans+=min-nums[j];
                j--;
            }
        }
        return ans;
    }
}
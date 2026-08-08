class Solution {
    public int maxProfit(int[] nums) {
        int min=Integer.MAX_VALUE;
        int prof=0;
        for(int i=0;i<nums.length;i++){
              int cost=nums[i]-min;
              prof=Math.max(prof,cost);
              min=Math.min(nums[i],min);
        }
        return prof;
    }
}
class Solution {
    public int maxProfit(int[] nums) {
        int prof=0;
        int min=Integer.MAX_VALUE;
   for(int i=0;i<nums.length;i++){
    int cost=nums[i]-min;
      prof=Math.max(prof,cost);
      min=Math.min(min,nums[i]);
        }
        return prof;
    }
}
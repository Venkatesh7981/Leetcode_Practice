class Solution {
    public int maxProfit(int[] nums) {
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<nums.length;i++){
          int cost=nums[i]-min;
              profit=Math.max(profit,cost);
              min=Math.min(nums[i],min);
        }
        return profit;
    
    }
}
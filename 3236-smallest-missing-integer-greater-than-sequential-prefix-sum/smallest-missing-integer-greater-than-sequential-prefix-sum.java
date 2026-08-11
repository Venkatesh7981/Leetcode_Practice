class Solution {
    public int missingInteger(int[] nums) {
       int min=nums[0];
        
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int i=1;
        while(i<nums.length && nums[i]==nums[i-1]+1){
              min+=nums[i];
              i++;
        }
        while(set.contains(min)){
            min++;
        }
        return min;
    }
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                long sum=(long)nums[i]+nums[j]+nums[k];
                ArrayList<Integer> a=new ArrayList<>();
                if(sum==0){
                 a.add(nums[i]);
                 a.add(nums[j]);
                 a.add(nums[k]);
                 set.add(a);
                 j++;
                 k--;
                }
                else if(sum<0){
                    j++;
                }
                else {
                    k--;
                }
            }
            
        }
        return new ArrayList<>(set);
    }
}
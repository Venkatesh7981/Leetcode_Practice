class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set=new HashSet<>();
        for(int i=0;i<=nums.length;i++){
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
            long sum=(long)nums[i]+nums[l]+nums[r];
          
            if(sum==0){
               ArrayList<Integer> a=new ArrayList<>();
               a.add(nums[i]);
               a.add(nums[l]);
               a.add(nums[r]);
               set.add(a);
               l++;
               r--;
            }
            else if(sum<0){
                l++;
            }
            else {
                r--;
            }
          }
        }
        return new ArrayList<>(set);
    }
}
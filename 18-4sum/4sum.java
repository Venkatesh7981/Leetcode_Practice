class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
     Arrays.sort(nums);int n=nums.length;
     HashSet<List<Integer>> set=new HashSet<>();
      if(n<4)
        return new ArrayList<>(set);
     for(int i=0;i<nums.length-3;i++){
        for(int j=i+1;j<nums.length-2;j++){
            int l=j+1;
            int k=nums.length-1;
          while(l<k){
            ArrayList<Integer> a=new ArrayList<>();
            long sum=(long)nums[j]+nums[k]+nums[l]+nums[i];
            if(sum==target){
                a.add(nums[l]);
                a.add(nums[k]);
                a.add(nums[j]);
                a.add(nums[i]);
                set.add(a);
            l++;
            k--;
            }
            else if(sum<target){
                l++;
            }
            else {
                k--;
            }
          }
        }
     }
     return new  ArrayList<>(set);
    }
}
class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        ArrayList<Integer> a=new ArrayList<>(set);
        Collections.sort(a);
       
              if(a.size()<3){
                return a.get(a.size()-1);
              }
              else {
                return a.get(a.size()-3);
              }
    }
}
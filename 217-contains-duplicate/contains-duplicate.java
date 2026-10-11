class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> set=new HashMap<>();
        for(int num:nums){
            set.put(num,set.getOrDefault(num,0)+1);
        }
        for(int num:set.keySet()){
            if(set.get(num)>1){
                return true;
            }
        }
        return false;
    }
}
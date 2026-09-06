class Solution {
    public boolean increasingTriplet(int[] nums) {
        int asc=Integer.MAX_VALUE;
        int dec=Integer.MAX_VALUE;
        for(int num:nums){
            if(num<=asc){
                asc=num;
            }
            else if (num<=dec){
                dec=num;
            }
            else{
          return true;
            }
        }
        return false;
    }
}
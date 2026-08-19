class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length+nums2.length];
          int i=0;
        for(int num:nums1){
            ans[i]=num;
            i++;
        }
        
        for(int num:nums2){
            ans[i]=num;
            i++;
        }
        double med=0;
        Arrays.sort(ans);
        int l=0;
        int j=ans.length-1;
        while(l<j){
            l++;
            j--;
        }
        if(l!=j){
             med=1.0*((ans[l]+ans[j]))/2;
        }
        else {
            return ans[l];
        }
        return med;
    }
}
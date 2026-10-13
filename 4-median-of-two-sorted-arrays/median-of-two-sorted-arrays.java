class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length+nums2.length];
        int ind=0;
        for(int num:nums1){
            ans[ind++]=num;
        }
        for(int num:nums2){
            ans[ind++]=num;
        }
        Arrays.sort(ans);
        int i=0;
        int j=ans.length-1;
        double res=0;
        while(i<j){
            i++;
            j--;
        }
        if(i!=j){
            res=1.0*(ans[i]+ans[j])/2;
        }
        else {
            return ans[j];
        }
        return res;
    }
}
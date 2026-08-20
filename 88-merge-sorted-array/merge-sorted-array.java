class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=nums1.length-nums2.length;
        int j=0;
        for(int i=0;i<nums2.length;i++){
            nums1[k]=nums2[j];
            k++;
            j++;
        }
    Arrays.sort(nums1);
    }
}
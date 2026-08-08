class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=nums1.length-nums2.length;
        int j=0;
        for(int i=k;i<nums1.length;i++){
            nums1[k]=nums2[j];
            j++;
            k++;
        }
        Arrays.sort(nums1);
    }
}
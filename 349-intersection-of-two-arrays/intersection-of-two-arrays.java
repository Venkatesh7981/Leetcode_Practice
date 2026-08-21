class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> a=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }

        for(int num:nums2){
            if(set.contains(num)){
                a.add(num);
                set.remove(num);
            }
        }

        int ans[]=new int[a.size()];
        int i=0;
        for(int num:a){
            ans[i]=num;
            i++;
        }
        return ans;
    }
}
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
         for(int num:nums2){
            map.put(num,map.getOrDefault(num,0)+1);
         }

        ArrayList<Integer> a=new ArrayList<>();
        for(int num:nums1){
            if(map.containsKey(num) && map.get(num)>0){
                a.add(num);  
                map.put(num, map.get(num) - 1); // Decrease available count
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
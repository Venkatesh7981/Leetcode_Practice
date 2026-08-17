class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res=0;
        int r=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                  set.remove(s.charAt(r));
                r++;
            }
            set.add(s.charAt(i));
            res=Math.max(res,i-r+1);
        }
  return res;
    }
}
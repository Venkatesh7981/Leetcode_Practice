class Solution {
    public char findTheDifference(String s, String t) {
       char ans=0;
       for(char ch:s.toCharArray()) ans^=ch;
       for(char cht:t.toCharArray()) ans^=cht;
       return ans;
    }
}
class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp=0;
        int tp=0;
        while(sp<=s.length()-1 && tp<=t.length()-1){
            if(s.charAt(sp)==t.charAt(tp)){
                sp++;
            }
            tp++;
        }
       return s.length()==sp;
    }
}
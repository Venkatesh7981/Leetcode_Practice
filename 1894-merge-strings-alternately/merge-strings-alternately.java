class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        String ans="";
        int pick=0;
        while(i<=word1.length()-1 && j<=word2.length()-1){
            if(pick==0){
                ans+=word1.charAt(i);
                i++;
                pick=1;
            }
            else if(pick==1){
                  ans+=word2.charAt(j);
                  j++;
                  pick=0;
            }
        }

        while(i<=word1.length()-1){
            ans+=word1.charAt(i);
            i++;
        }
        while(j<=word2.length()-1){
            ans+=word2.charAt(j);
            j++;
        }
        return ans;
    }
}
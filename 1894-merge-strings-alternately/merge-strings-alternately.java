class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        char a[]=word1.toCharArray();
        char b[]=word2.toCharArray();
        int n=(word1.length()<word2.length())?word1.length():word2.length();
        int i;
        for(i=0;i<n;i++){
            ans+=a[i];
            ans+=b[i];
        }
        i=n;
        while(i<a.length){
            ans+=a[i];
            i++;
        }
        i=n;
        while(i<b.length){
            ans+=b[i];
            i++;
        }
        return ans;
    }
}
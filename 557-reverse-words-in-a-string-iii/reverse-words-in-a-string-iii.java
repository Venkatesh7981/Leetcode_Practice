class Solution {
    public String reverseWords(String s) {
        String word[]=s.split(" ");
          StringBuilder st=new StringBuilder();
        for(String wr:word){
              StringBuilder ans=new StringBuilder(wr);
            st.append(ans.reverse());
            st.append(" ");
        }
        return new String(st).trim();
    }
}
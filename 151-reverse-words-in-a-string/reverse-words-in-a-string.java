class Solution {
    public String reverseWords(String s) {
        String a[]=s.split(" +");
        StringBuilder st=new StringBuilder();
        for(int i=a.length-1;i>=0;i--){
            st.append(a[i]);
            st.append(" ");
        }
        return st.toString().trim();
    }
}
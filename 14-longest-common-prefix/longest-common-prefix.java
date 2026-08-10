class Solution {
    public String longestCommonPrefix(String[] strs) {
    Arrays.sort(strs);
    char a[]=strs[0].toCharArray();
    char b[]=strs[strs.length-1].toCharArray();
    StringBuilder st=new StringBuilder();
    for(int i=0;i<a.length;i++){
        if(a[i]!=b[i]){
           break;
        }
        else {
            st.append(a[i]);
        }
      }
      return new String(st);
    }
}
class Solution {
    public boolean isPalindrome(String s) {
       char a[]=s.toCharArray();
       int i=0;
       int j=a.length-1;
       while(i<j){
        char first=s.charAt(i);
        char sec=s.charAt(j);
        if(!Character.isLetterOrDigit(first)){
            i++;
        }
        else if(!Character.isLetterOrDigit(sec)){
            j--;
        }
        else {
            if(Character.toLowerCase(first)!=Character.toLowerCase(sec)){
                return false;
            }
            i++;
            j--;
        }
       }
       return true;
    }
}
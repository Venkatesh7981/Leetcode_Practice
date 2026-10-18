class Solution {
    public boolean isPalindrome(String s) {
        char a[]=s.toCharArray();
        int i=0;
        int j=a.length-1;
        while(i<j){
            int fis=s.charAt(i);
            int sec=s.charAt(j);
            if(!Character.isLetterOrDigit(fis)){
                i++;
            }
            else if (!Character.isLetterOrDigit(sec)){
                j--;
            }
            else {
                if(Character.toLowerCase(fis)!=Character.toLowerCase(sec)){
                    return false;
                }
                i++;
                j--;
            }

        }
        return true;
    }
}
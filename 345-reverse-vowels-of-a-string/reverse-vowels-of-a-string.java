class Solution {
    public String reverseVowels(String s) {
        
    char ans[]=s.toCharArray();
    int i=0;
    int j=ans.length-1;
    while(i<j){
        while(i<ans.length){
            if(ans[i]=='a'|| ans[i]=='e' || ans[i]=='i' || ans[i]=='o' || ans[i]=='u'||
            ans[i]=='A'|| ans[i]=='E' ||ans[i]=='U'|| ans[i]=='I' ||ans[i]=='O'){
                break;
            }
            i++;
        }
        while(j>=0){
             if(ans[j]=='a'|| ans[j]=='e' || ans[j]=='i' || ans[j]=='o' || ans[j]=='u'||ans[j]=='A'|| ans[j]=='E' ||ans[j]=='U'|| ans[j]=='I' ||ans[j]=='O'){
                break;
            }
            j--;
        }
        if(i<j){
            char temp=ans[i];
            ans[i]=ans[j];
            ans[j]=temp;
            i++;
            j--;

        }
    }
    return new String(ans);
    }
}
class Solution {
    public String reverseVowels(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('A',1);
        map.put('E',1); 
        map.put('I',1);
        map.put('O',1);
        map.put('U',1);
        map.put('a',1);
        map.put('e',1);
        map.put('i',1);
        map.put('o',1);
        map.put('u',1);
        char a[]=s.toCharArray();
        int i=0;
        int j=a.length-1;
        while(i<j){
            while(i<j && !map.containsKey(a[i])){
                i++;
            }
            while(i<j &&!map.containsKey(a[j])){
                j--;
            }
            if(i<j){
                char temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
return new String(a);
    }
}
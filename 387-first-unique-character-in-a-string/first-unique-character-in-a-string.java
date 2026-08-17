class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int i=0;
       for(char ch:s.toCharArray()){
        if(map.get(ch)==1){
            return i;
        }
        i++;
       }
        return -1;
    }
}
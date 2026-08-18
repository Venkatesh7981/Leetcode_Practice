class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
   int prod=1;

        while(n>0){
            int r=n%10;
            map.put(r,map.getOrDefault(r,0)+1);
            n=n/10;
        }
        int sum=0;
      for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            sum+=entry.getKey()*entry.getValue();
            }
        return sum;
    }
}
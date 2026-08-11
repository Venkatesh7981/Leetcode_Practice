class Solution {
    public boolean isHappy(int n) {

HashSet<Integer> set=new HashSet<>();
while(n!=1){
   int ans=0;
    while(n!=0){
       int r=n%10;
        ans+=r*r;
        n=n/10;
      }
      n=(int)ans;
      if(set.contains(ans)){
        return false;
      }
      set.add(ans);
      }
      return true;
    }
}
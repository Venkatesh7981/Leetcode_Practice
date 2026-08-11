class Solution {
    public boolean isHappy(int n) {
        long ans=0;
        HashSet<Integer> set=new HashSet<>();
        while(n!=1){
            int sum=0;
            while(n!=0){
                int r=n%10;
                sum+=r*r;
                n/=10;
            }
             
             n=(int)sum;
            if(set.contains(sum)){
                return false;
            }
            set.add(sum);
           
        }
        return  true;
    }
}
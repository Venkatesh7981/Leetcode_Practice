class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int sum=0;
        int prod=1;
        int ans=0;
        while(n>0){
            int r=n%10;
            sum+=r;
            prod*=r;
            n=n/10;
        }
            ans=sum+prod;
            return temp%ans==0;
    }
}
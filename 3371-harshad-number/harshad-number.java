class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int temp=x;
        while(x>0){
            int r=x%10;
            sum+=r;
            x=x/10;
        }
        x=temp;
        if(x%sum==0) return sum;
        else return -1;
    }
}
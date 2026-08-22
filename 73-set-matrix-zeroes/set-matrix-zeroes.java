class Solution {
    public void setZeroes(int[][] nums) {
     int r=nums.length;
     int c=nums[0].length;
     boolean []m=new boolean[r];
     boolean []n=new boolean[c];
     for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
        if(nums[i][j]==0){
            m[i]=true;
            n[j]=true;
        }
       }
     }
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(m[i] || n[j]){
                nums[i][j]=0;
            }
        }
       }
    }
}